package nuc.edu.cn.cx.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>项目名称: HealthPlatform </p>
 * <p>文件名称: ExceptionHandler.java </p> 
 * @author chenx
 * @date 2020年2月11日
 * @description 配置全局的异常捕获--web页面跳转
 */
@ControllerAdvice
public class ExceptionHandler {
	@org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
	public ModelAndView errorException(HttpServletRequest request,HttpServletResponse response,Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("exception",e);
		mv.addObject("url", request.getRequestURL());
		mv.setViewName("error");
		return mv;
	}
}
