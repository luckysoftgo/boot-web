package com.javabase.demo.web.web;

import com.application.base.common.web.BaseCommController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @desc 默认页面访问方式.
 */
@Controller
@RequestMapping
public class WebDemoController extends BaseCommController {
	
	/**
	 * 欢迎页
	 * @return
	 */
	@RequestMapping(value ="/welcome", method = RequestMethod.GET)
	public String welcome(){
		return "/welcome";
	}
	
	
	/**
	 * 登录页.
	 * @param map
	 * @return
	 */
	@RequestMapping(value ="/login", method = RequestMethod.GET)
	public String login(Map<String,Object> map){
		return "/background/framework/login";
	}
	
}
