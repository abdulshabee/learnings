package oops.clone;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable, Serializable{

	private int age;
	private String name;
	private List<String> pets;
	
	public List<String> getPets() {
		return pets;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	public void setPets(List<String> pets) {
		this.pets = pets;
	}

	//Normal constructor with arguments
	public Person(int age,String name) {
		this.age = age;
		this.name = name;
		
	}
	
	//copy constructor
	
	public Person(Person person) {
		this.age = person.age;
		this.name = person.name;
		this.pets = new ArrayList<String>(person.pets); // defensive copy
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
