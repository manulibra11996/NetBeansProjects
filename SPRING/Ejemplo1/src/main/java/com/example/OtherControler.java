package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OtherControler {
	@GetMapping("/patata")
	public String goXXX() {
		return "xxx";
	}
}
