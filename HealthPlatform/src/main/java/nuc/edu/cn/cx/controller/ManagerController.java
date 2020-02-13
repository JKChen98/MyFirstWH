package nuc.edu.cn.cx.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import nuc.edu.cn.cx.bean.Manager;
import nuc.edu.cn.cx.service.ManagerService;

/**
 * <p>项目名称: HealthPlatform </p>
 * <p>文件名称: ManagerController.java </p> 
 * @author chenx
 * @date 2020年2月10日
 * @description 管理员信息的增删改查
 */

@Controller
@RequestMapping("/manager")
public class ManagerController {
	
	@Autowired
	private ManagerService managerService;
	
	private static Logger log = Logger.getLogger(ManagerController.class);
	
	//超级管理员添加管理员
	@RequestMapping("/add")
	public String addManager(@ModelAttribute Manager manager) {
		managerService.addManager(manager);
		log.info("新增管理员成功，管理员信息为：" + manager.toString());
		return "manager/manager_index";
	}
	
	//超级管理员删除管理员
	@RequestMapping("/delete")
	public String deleteManager(@RequestParam int id) {
		managerService.deleteManager(id);
		log.info("管理员已删除");
		return "manager/manager_index";
	}
	
	//管理员修改密码
	@RequestMapping("/modify")
	public String modifyManager(@ModelAttribute Manager manager) {
		managerService.modifyManager(manager);
		log.info("管理员密码已被本人修改");
		return "manager/manager_login";
	}
	
	//管理员后台登录
	@RequestMapping("/login")
	public String login(@ModelAttribute Manager manager2,HttpSession session) {
		log.info("管理员正在尝试登录");
		try {
			Manager manager = managerService.selectManager(manager2);
			
			log.info("管理员成功登录");
			log.info("登录管理员信息:"+manager.toString());
			
			session.setAttribute("manager", manager);
			 
		} catch (Exception e) {
			log.error("工号或密码不正确,登录失败！");
			session.setAttribute("errorMessage", "您的工号或密码输入错误，请重新输入");
			return "manager/error";
		}
		
		return "manager/manager_index";
	}
	
	//管理员离开
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.setAttribute("manager", null);
		log.info("管理员已退出登录");
		return "manager/manager_login";
	}
}
