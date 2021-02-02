package com.skillsunion.springapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestMainController {

	@Test
	public void slowSpeedTest() {
		MainController controller = new MainController();
		String result = controller.speed(59);
		assert(result).equals("Go faster!");
	}
	
	@Test
	public void normalSpeedTest() {
		MainController controller = new MainController();
		String result = controller.speed(65);
		assert(result).equals("Go on");
	}
	
	@Test
	public void fastSpeedTest() {
		MainController controller = new MainController();
		String result = controller.speed(85);
		assert(result).equals("Slow down!");
	}
}
