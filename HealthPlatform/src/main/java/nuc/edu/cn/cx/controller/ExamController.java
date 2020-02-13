package nuc.edu.cn.cx.controller;

import java.awt.Font;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.chart.title.LegendTitle;
import org.jfree.data.category.CategoryDataset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;

import nuc.edu.cn.cx.bean.Exam;
import nuc.edu.cn.cx.bean.User;
import nuc.edu.cn.cx.service.ExamService;

/**
 * <p>
 * 项目名称: HealthPlatform
 * </p>
 * <p>
 * 文件名称: ExamController.java
 * </p>
 * 
 * @author chenx
 * @date 2020年2月6日
 * @description
 */

@Controller
@RequestMapping("/test")
public class ExamController {

	@Autowired
	private ExamService examService;

	private Logger log = Logger.getLogger(ExamController.class);

	// 管理员负责添加用户体检记录
	@RequestMapping("/add")
	public String addExamRecord(@ModelAttribute Exam exam) {
		examService.addExam(exam);
		log.info("该用户的体检记录已经成功添加");
		log.info("添加用户体检记录的详细信息是：" + exam.toString());
		return "";
	}

	// 用户查询自己的体检记录
	@RequestMapping("/find")
	public String findExamRecord(@RequestParam String id, HttpSession session, HttpServletRequest request,
			Integer pageNum) throws Exception {
		int i = Integer.parseInt(id);
		// 一.用户血压折线图
		CategoryDataset dataset = examService.findSomeRecords(i);

		// 定义图表对象数据
		JFreeChart chart = ChartFactory.createLineChart("体检血压分析", "时间", "mmHg", dataset, PlotOrientation.VERTICAL, // 图表方向
				true, // 是否显示图例
				true, // 是否显示工具提示
				false);// 是否产生url链接

		// 获取图形的绘制机构
		CategoryPlot plot = chart.getCategoryPlot();

		// 设置图示字体
		chart.getTitle().setFont(new Font("黑体", Font.BOLD, 22));
		// 设置横轴的字体
		CategoryAxis categoryAxis = plot.getDomainAxis();
		categoryAxis.setLabelFont(new Font("宋体", Font.BOLD, 22));// x轴标题字体
		categoryAxis.setTickLabelFont(new Font("宋体", Font.BOLD, 18));// x轴刻度字体

		// 以下两行 设置图例的字体
		LegendTitle legend = chart.getLegend(0);
		legend.setItemFont(new Font("宋体", Font.BOLD, 14));
		// 设置竖轴的字体
		NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		rangeAxis.setLabelFont(new Font("宋体", Font.BOLD, 22)); // 设置数轴的字体
		rangeAxis.setTickLabelFont(new Font("宋体", Font.BOLD, 22));
		rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());// 去掉竖轴字体显示不全
		rangeAxis.setAutoRangeIncludesZero(true);
		rangeAxis.setUpperMargin(0.20);
		rangeAxis.setLabelAngle(Math.PI / 2.0);

		rangeAxis.setLowerBound(80);
		rangeAxis.setUpperBound(150);

		rangeAxis.setAutoTickUnitSelection(false);
		double unit = 10d;// 刻度的长度
		NumberTickUnit ntu = new NumberTickUnit(unit);
		rangeAxis.setTickUnit(ntu);

		// 将图形转换为图片传到前台
		String fileName = ServletUtilities.saveChartAsJPEG(chart, 700, 500, null, request.getSession());
		String chartURL = request.getContextPath() + "/chart?filename=" + fileName;

		log.info("该用户的血压折线图已生成");

		session.setAttribute("chartURL", chartURL);

		// 二.用户所有的体检记录

		if (pageNum == null) {
			pageNum = 1;
		}
		// 使用pagehelper分页，定义每页数量
		int pageSize = 3;

		PageInfo<Exam> page = examService.findExam(i, pageNum, pageSize);

		List<Exam> examlist = page.getList();
		session.setAttribute("page", page);
		System.out.println("当前页数" + page.getPageNum());
		session.setAttribute("examlist", examlist);
		User user = (User) session.getAttribute("user");

		log.info("当前页用户的所有体检记录已查询");
		for (Exam exam : examlist) {
			exam.setUser(user);
			log.info("用户体检详细记录如下：" + exam.toString());
		}

		return "test";
	}
}
