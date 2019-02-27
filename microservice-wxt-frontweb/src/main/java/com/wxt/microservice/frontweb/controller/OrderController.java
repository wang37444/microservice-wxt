package com.wxt.microservice.frontweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件名：OrderController.java
 * 描述：
 * 作者：王承
 * 日期：Feb 21, 20195:08:33 PM
 */
@RestController
public class OrderController {

	@RequestMapping("/test")
	public String test() throws Exception {
		return "Hello World";
	}

}
