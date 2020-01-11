package com.copo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService; 
	
	public TennisCoach() {
		System.out.println(">> Tenniscoach: inside constructor method");
	}
	
	
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> Tenniscoach: inside doSomeCrazyStuff method");
		this.fortuneService = fortuneService;
	}
	*/
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> Tenniscoach: inside setter method");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDalyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneService();
	}
}
