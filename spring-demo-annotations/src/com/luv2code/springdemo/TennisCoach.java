package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component//("thatSillyCoach")
public class TennisCoach implements Coach{

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
/*	//@Autowired
	public TennisCoach(FortuneService fortuneService) {
		System.out.println(">> Tennis Coach: inside defaault constructor");
		this.fortuneService=fortuneService;
	}
	
	//define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> Tennis Coach: inside setFortuneService()");
		fortuneService = theFortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
