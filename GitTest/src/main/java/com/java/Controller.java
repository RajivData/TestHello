package com.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/org")
public class Controller {

	@GetMapping(value="/get")
	public String getMsg() {
		return "Hello Rajiv welcome to git";
	}
}
