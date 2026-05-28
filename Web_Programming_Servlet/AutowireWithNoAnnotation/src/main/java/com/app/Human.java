package com.app;

public class Human {

	public Heart heart;

	public Human() {
		System.out.println("In Human constructor");
	}

	public Human(Heart heart) {
		System.out.println("in para const of Human");
		this.heart = heart;
	}

	public void setHeart(Heart heart) {
		System.out.println("In Setter");
		this.heart = heart;
	}

	public void pump() {
		if (heart != null) {
			heart.pumping();
		} else {
			System.out.println("you are dead");
		}
	}
}
