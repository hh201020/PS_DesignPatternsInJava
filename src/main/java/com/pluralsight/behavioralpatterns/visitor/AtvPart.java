package com.pluralsight.behavioralpatterns.visitor;

public interface AtvPart {
	public void accept(AtvPartVisitor visitor);
}
