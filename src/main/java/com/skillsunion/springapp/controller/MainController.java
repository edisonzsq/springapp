package com.skillsunion.springapp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@RequestMapping("/speed/{speed}")
	public String speed (@PathVariable("speed") int speed) {
		if(speed >= 80) {
			return "Slow down!";
		}
		
		if(speed < 80 && speed > 60) {
			return "Go on";
		}
		
		return "Go faster!";
	}
}
