package nuc.edu.cn.cx.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import nuc.edu.cn.cx.bean.User;
import nuc.edu.cn.cx.service.UserService;

/**
 * <p>项目名称: HealthPlatform </p>
 * <p>文件名称: UserController.java </p> 
 * @author chenx
 * @date 2020年1月6日
 * @description 教师登录注册模块
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	private static Logger log = Logger.getLogger(UserController.class);
	
	@RequestMapping("/registe")
	public String registe(@Valid User user,BindingResult bindingResult) {
		
		//表单验证后台显示错误注册信息
		/*
		 * if (bindingResult.hasErrors()) {
		 * log.info(bindingResult.getFieldError().getDefaultMessage()); return
		 * "redirect:error"; }
		 */
		
		userService.addUser(user);
		log.info("用户注册成功！！！"+user.toString());
		return "main";
	}
	
	//用户登录
	@RequestMapping("/login")
	public String login(@ModelAttribute User user2,HttpSession session) {
		log.info("用户正在尝试登录");
		try {
			User user = userService.selectUser(user2);
			
			log.info("用户成功登录");
			log.info("登录用户信息:"+user.toString());
			
			session.setAttribute("user", user);
			 
		} catch (Exception e) {
			log.error("用户名或密码不正确,登录失败！");
			session.setAttribute("errorMessage", "您输入的用户名或密码错误，请重新输入");
			return "error";
		}
		
		return "main";
	}
	
	//用户离开
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.setAttribute("user", null);
		log.info("用户已退出登录");
		return "main";
	}
	
	//用户申请成为会员
	@RequestMapping("/member")
	public String member() {
		return "main";
	}
}
