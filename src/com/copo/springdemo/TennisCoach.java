package com.copo.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDalyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley11";
	}

}
