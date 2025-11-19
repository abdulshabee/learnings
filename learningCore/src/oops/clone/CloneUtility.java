package oops.clone;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <ol><li>Clone feature helps us to do a swallow/deep copy of an object.</li>
 * <li>Clone by default perform the swallow copy mean primitive data's are copy the value and
 * Object are share by their reference.</li>
 * <li>To perform the deep copy. we are suppose to manually copy the immutable object 
 * and for mutable do the defensive copy. eg new ArrayList<>(ObjRefernce)
 *<li> copy constructor is preferable than clone because. Clone need to catch the exception.
 *Need to perform deep copy. essential need to careful on immutable objects 
 * </ol>
 */
public class CloneUtility {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person person = new Person(12,"john");
		person.setPets(new ArrayList<>(Arrays.asList("cat","dog")));
		
		Person person2 = (Person) person.clone(); //swallowcopy
		Person person3 = new Person(person); // copy constructor
		
		
		System.out.println(person.getPets().toString());
		System.out.println(person2.getPets().toString());
		System.out.println(person3.getPets().toString());
		System.out.println("after editing in person2");
		
		person2.getPets().add("rabbit");
		
		System.out.println(person.getPets().toString());
		System.out.println(person2.getPets().toString());
		System.out.println(person3.getPets().toString());
		
		person3.getPets().add("love birds");
		System.out.println("after editing in person3");
		
		System.out.println(person.getPets().toString());
		System.out.println(person2.getPets().toString());
		System.out.println(person3.getPets().toString());
	}
}
