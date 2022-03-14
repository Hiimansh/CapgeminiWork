package com.cg.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	private Heart heart;

	public Human() {

	}

	public Human(Heart heart) {
		this.heart = heart;
	}

	@Autowired
	@Qualifier("humanHeart")
	public void setHeart(Heart heart) {
		this.heart = heart; 
	}

	public void startPumping() {

		if (heart != null) {
			heart.pump();
			System.out.println("Name of the Animal: "+ heart.getNameOfAnimal()
								+", No of Heart he has: "+ heart.getNoOfHeart());
		} else {
			System.out.println("You are dead");
		}
	}

}
