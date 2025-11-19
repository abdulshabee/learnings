package oops.daimondProblem;

public interface B {

	default void print() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
