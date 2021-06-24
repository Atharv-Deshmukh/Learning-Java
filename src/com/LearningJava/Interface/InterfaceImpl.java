package com.LearningJava.Interface;

public class InterfaceImpl implements InterfaceTut{

	@Override
	public String getName() {
		String name = "Here Goes My Name";
		return name;
	}

	@Override
	public void show() {
		System.out.println("You can directly call the method");
		
	}

}
