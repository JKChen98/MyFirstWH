package nuc.edu.cn.cx.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import nuc.edu.cn.cx.bean.Dairy;
import nuc.edu.cn.cx.bean.User;
import nuc.edu.cn.cx.service.DairyService;

/**
 * <p>项目名称: HealthPlatform </p>
 * <p>文件名称: DairyController.java </p> 
 * @author chenx
 * @date 2020年1月7日
 * @description 
 */

@Controller
@RequestMapping("/dairy")
public class DairyController {
	
	@Autowired
	private DairyService dairyService;
	
	private Logger log = Logger.getLogger(DairyController.class);
	
	//用户添加健康日记
	@RequestMapping("/add")
	public String addDairy(@ModelAttribute Dairy dairy,HttpSession session) {
		User user = (User) session.getAttribute("user");
		dairy.setUser(user);
		dairyService.addDairy(dairy);
		
		log.info("教师健康日记信息已记载");
		log.info("健康日记记载信息："+dairy.toString());
		
		return "dairy";
	}
	
	//用户查询健康日记信息
	@RequestMapping("/find")
	public String findDairy(@RequestParam String date_add,HttpSession session) throws ParseException {
		//字符串转成日期格式
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date_add2 = format.parse(date_add);
		
		//根据用户和日期进行查询
		User user = (User) session.getAttribute("user");
		Dairy dairy = dairyService.findDairy(date_add2,user);
		dairy.setUser(user);
		
		
		log.info("教师健康日记信息已查询");
		log.info("用户该天的日记信息是："+dairy.toString());
		
		//将查询出来的日记存储到session中
		session.setAttribute("dairy", dairy);
		session.setAttribute("date_add", date_add);
		
		return "dairy";
	}
}
