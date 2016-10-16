package com.pluralsight.creationalpatterns.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

	protected List<Page> pages = new ArrayList<>();
	
	public List<Page> getPages() {
		return pages;
	}

	public Website() {
		this.createWebsite();
	}
	
	// This is the crux of the factory method pattern here
	public abstract void createWebsite();
	
}
