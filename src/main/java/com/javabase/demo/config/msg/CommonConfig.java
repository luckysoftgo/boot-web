package com.javabase.demo.config.msg;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.application.base.common.result.ResultMessageContext;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @desc 全局消息配置
 * @author 孤狼
 */
@Configuration
public class CommonConfig implements WebMvcConfigurer {
	
	@Bean
	public ResultMessageContext getMsgContext(){
		ResultMessageContext context = new ResultMessageContext();
		//全局消息的配置,如果有多个消息,则在配置文件中用","分割开来.
		//message/demo1.xml;message/demo2.xml;
		context.setPaths("message/resultMessage.xml");
		context.init();
		return context;
	}
	
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//将所有/static/** 访问都映射到classpath:/static/ 目录下
		registry.addResourceHandler("/**").addResourceLocations("classpath:/META-INF/resources/**");
	}

}
