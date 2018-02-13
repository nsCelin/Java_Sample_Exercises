package com.abstractClass;

abstract class Canine extends Animal {
	public void WagTail()
	{
		System.out.println("Wagging");
	}
	
	@Override
	public void move()
	{
		System.out.println("Move");
	}
}
