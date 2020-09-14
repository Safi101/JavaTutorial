package myAbstraction;

abstract class Animal1 {
	
	public abstract void animalSound();// every subclass must have this method implemented
	
	public void sleep() { // abstract class can have non abstract method but interface can only have abstract methods
		System.out.println("sleep");
	}

}
