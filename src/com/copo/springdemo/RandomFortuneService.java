package com.copo.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"Annotation 1",
			"Annotation 2",
			"Annotation 3",
			"Annotation 4"
	};
	
	private Random myRandom = new Random();
	@Override
	public String getFortuneService() {
		
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
