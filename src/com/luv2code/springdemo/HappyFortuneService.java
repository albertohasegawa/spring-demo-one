package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		double x = Math.random();
		if (x < 0.3) {
			return "Today is your lucky day!";			
		} else if (x > 0.7) {
			return "Not so lucky, watch out!";
		} else if (x >= 0.3 && x <= 0.7) {
			return "So-so. Just another day on the job!";
		} else {
			return "Error!";
		}
	}

}
