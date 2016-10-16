package com.pluralsight.structuralpatterns.bridge.shape1_no_pattern;

public class GreenSquare extends Square {

	@Override
	public void applyColor() {
		System.out.println("Applying green color");
	}

}
