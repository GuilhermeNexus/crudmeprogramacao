package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class Home {
	@RequestMapping("/")
	@ResponseBody
	public String Hello() {
		return "Digite /curso";
	}
}
