package com.pluralsight.structuralpatterns.decorator;

public class DecoratorSandwichDemo {

	public static void main(String args[]) {
		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
		
		System.out.println(sandwich.make());
	}
}