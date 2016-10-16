package com.pluralsight.structuralpatterns.bridge.shape1_no_pattern;

public class RedCircle extends Circle {

	@Override
	public void applyColor() {
		System.out.println("Applying red color");
	}

}
