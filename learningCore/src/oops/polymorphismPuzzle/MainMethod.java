package oops.polymorphismPuzzle;

public class MainMethod {
	
	public static void main(String[] args) {
		Animal animal = new Cat();
		
		animal.makeSound(); // Meaow
		animal.hide(); // Animal
		
		Cat cat = new Cat();
		
		cat.makeSound(); //Meaow
		cat.hide(); //Cat hide
	}
}
