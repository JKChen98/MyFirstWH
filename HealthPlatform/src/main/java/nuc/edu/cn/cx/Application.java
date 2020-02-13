package nuc.edu.cn.cx;

import org.jfree.chart.servlet.DisplayChart;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
/*
 * 启动类
 */
@MapperScan(basePackages = "nuc.edu.cn.cx.dao") //扫描mapper对象
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
	}
	
	//DisplayChart图片生成对象,并设置访问的URL
	@Bean
	public ServletRegistrationBean<DisplayChart> MyServlet() {
		return new ServletRegistrationBean<>(new DisplayChart(),"/chart");
	}

}
