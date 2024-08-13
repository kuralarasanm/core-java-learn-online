package Encapsulation;

// getters and setters
// ->binding data members and methods into a single entity

class Demo{
	// instance variables,methods
	private int age=23;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
public class Encapsulation {
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.setAge(50 );
		System.out.println(obj.getAge());
	}
}
