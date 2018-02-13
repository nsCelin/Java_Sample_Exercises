package com.abstractClass;

class Dog extends Canine {
	
@Override
   public void MakeNoise()
   {
	   System.out.println("Noise");
   }
   
   public void fetch()
   {
	   System.out.println("Fetch");
   }
   
   /*Assume this is present. 
    * Then whenver move() method is called from App.java, only this version will be called.
    * As Dog object is being passed in three cases*/
   /*@Override
	public void move()
	{
		System.out.println("Dog-Move");
	}*/

}
