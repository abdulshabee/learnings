package oops.polymorphismPuzzle;

public class Cat extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("Meaow");
	}
	
	public static void hide() {
		System.out.println("cat is hide");
	}
}
