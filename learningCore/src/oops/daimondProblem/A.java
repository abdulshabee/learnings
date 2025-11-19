package oops.daimondProblem;

public interface A {

	default void print() {
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
