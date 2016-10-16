package com.pluralsight.structuralpatterns.bridge.shape2_with_pattern;

public class Green implements Color {

	@Override
	public void applyColor() {
		System.out.println("Applying green color");
	}

}
