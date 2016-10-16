package com.pluralsight.structuralpatterns.composite;


public class CompositeMenuDemo {

	public static void main(String[] args) {
		
		Menu mainMenu = new Menu("Main", "/main");
		
		MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
		
		mainMenu.add(safetyMenuItem);
		
		Menu claimsSubMenu = new Menu("Claims", "/claims");
		claimsSubMenu.add(new Menu("added menu", "added menu attribute"));
		claimsSubMenu.add(new MenuItem("added menuItem", "added menuItem attribute"));

		mainMenu.add(claimsSubMenu);
		
		MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
//		personalClaimsMenu.add(new Menu("added wwmenu", "added wwmenu attribute"));

		claimsSubMenu.add(personalClaimsMenu);
		
		System.out.println(mainMenu.toString());
	}
}
