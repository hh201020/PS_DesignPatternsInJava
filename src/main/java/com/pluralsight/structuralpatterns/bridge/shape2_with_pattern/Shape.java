package com.pluralsight.structuralpatterns.bridge.shape2_with_pattern;

public abstract class Shape {

	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	abstract public void applyColor();
}
