package com.pluralsight.structuralpatterns.bridge.shape1_no_pattern;

public class BlueCircle extends Circle {

	@Override
	public void applyColor() {
		System.out.println("Applying blue color");
	}

}
