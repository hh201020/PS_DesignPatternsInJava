package com.pluralsight.structuralpatterns.bridge.shape1_no_pattern;

public class BlueSquare extends Square {

	@Override
	public void applyColor() {
		System.out.println("Applying blue color");
	}

}
