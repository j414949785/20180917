package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jt.feign.EurekaServiceFeign;

@RestController
public class HelloController {
    //注入Feign接口
	@Autowired
	private EurekaServiceFeign eurekaServiceFeign ;
	//用户访问RESTFul请求 URL请求
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name){
		return eurekaServiceFeign.hello(name);
	}
}
