package com.pluralsight.structuralpatterns.bridge.shape1_no_pattern;

public class RedSquare extends Square {

	@Override
	public void applyColor() {
		System.out.println("Applying red color");
	}
}
