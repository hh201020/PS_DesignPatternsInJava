package com.pluralsight.structuralpatterns.bridge.shape2_with_pattern;

public class Blue implements Color {

	@Override
	public void applyColor() {
		System.out.println("Applying blue color");
	}

}
