package javaLearn;

class student{
	//1.Methods
	//2.variables(data members)
	String name;
	int rank;
	
	void display() {
		System.out.println("name = "+name);
		System.out.println("rank = "+rank);
	}
}

public class ClassAndObject {
	public static void main(String[] args) {
		student s1 =new student();
		System.out.println("user1");
		s1.name="kural";
		s1.rank=1;
		s1.display();
		student s2=new student();
		System.out.println("user2");
		s2.name="naveen";
		s2.rank=2;
		s2.display();
	}
}
