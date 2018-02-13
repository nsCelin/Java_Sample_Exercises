package com.abstractClass;

/*Question 2*/
public class App {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.MakeNoise(); /*It calls the overriden version present inside Dog*/
		d.move(); /*It calls the overriden version present inside its parent*/
		d.WagTail(); /*It calls the method of its parent through inheritance*/
		d.fetch(); /*It calls its own implementation*/
		
		Canine c = new Dog();
		c.MakeNoise(); /*It calls the overriden version present inside Dog*/
		c.move(); /*It calls its own overriden method*/
		c.WagTail(); /*It calls its own method*/
		//c.fetch();
		
		Animal a = new Dog();
		a.MakeNoise(); /*It calls the overriden version present inside Dog*/
		a.move(); /*It calls the overriden version present inside Canine which Dog inherits*/
		//a.WagTail(); /*WagTail is not an overriden method in Canine. So reference variable cant access it*/
		//a.fetch(); /*fetch is purely a Dog method*/

	}

}

/*Rules
 * 1. If its a superclass reference, and any of the subclasses (Canine or Dog) has overriden the implementations,
 *    then the overriden version is called (Either Dog or Canine depending on object being passed, generally.)
 */