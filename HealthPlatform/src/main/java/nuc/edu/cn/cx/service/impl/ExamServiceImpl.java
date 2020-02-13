package nuc.edu.cn.cx.service.impl;

import java.util.List;

import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import nuc.edu.cn.cx.bean.Exam;
import nuc.edu.cn.cx.dao.ExamDao;
import nuc.edu.cn.cx.service.ExamService;

/**
 * <p>项目名称: HealthPlatform </p>
 * <p>文件名称: ExamServiceImpl.java </p> 
 * @author chenx
 * @date 2020年2月6日
 * @description 
 */
@Service
public class ExamServiceImpl implements ExamService{

	@Autowired
	private ExamDao examDao;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void addExam(Exam exam) {
		examDao.addExam(exam);
		
	}
	
	//使用pgaehelper插件进行分页
	@Transactional(propagation = Propagation.SUPPORTS)
	public PageInfo<Exam> findExam(int id,int pageNum,int pageSize) {
		//页码和每页显示数量,即开始分页！
		PageHelper.startPage(pageNum,pageSize);
		
		List<Exam> examlist = examDao.findExam(id);
		
		PageInfo<Exam> page = new PageInfo<Exam>(examlist);
		
		return page;
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public CategoryDataset findSomeRecords(int id) {
		
		//创建数据集
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		List<Exam> recordlist = examDao.findSomeRecords(id);
		 
		//遍历循环添加数据到数据集
		for (Exam exam : recordlist) {
			Double sp = exam.getSp();
			Double dp = exam.getDp();
			String datetime = exam.getDatetime();
			
			  dataset.addValue(sp, "收缩压", datetime); 
			  dataset.addValue(dp, "舒张压", datetime);
			
		}
		 
		 return dataset;
	   
	}

}
