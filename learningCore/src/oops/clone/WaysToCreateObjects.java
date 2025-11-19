package oops.clone;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;

public class WaysToCreateObjects {
	public static void main(String[] args) throws Exception{
		
		//1) new keyword
		
		Person person1 =new Person(12,"Das");
		
		//2)  using clone
		Person person2 = (Person)person1.clone();
		
		//3) using deserialization
		ObjectInputStream objStream = new ObjectInputStream(new FileInputStream("person.ser"));
		Person person3 = (Person) objStream.readObject();
		
		//4) reflection
		Constructor<Person> cons = Person.class.getConstructor();
		
		Person person4 = cons.newInstance();
		
		
		
	}
}
