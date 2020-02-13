package nuc.edu.cn.cx.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
		
		private Logger log = Logger.getLogger(IndexController.class);
		@RequestMapping("/main")
		public String index() {
			log.info("用户在访问网站当中");
			return "main";
		}
	
}
