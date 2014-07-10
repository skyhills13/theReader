package com.rbgroup.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/") // 괄호 안의 url로 접근 시, 아래의 method 호출.
	public String home(){
		//spring setting인 theReader-servlet.xml에서 prefix와 suffix를 지정해주었으므로 "/home.jsp"와 같음 
		return "home";
	}
}
