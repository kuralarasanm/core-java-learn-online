package javaLearn;

class abcd {
	int num1, num2,num3, result;
    // default constructor
	abcd() { 
		num1 = 10;
		num2 = 20;
	}
	//Parameterized constructor
	abcd(int a,int b){
		num1=a;
		num2=b;
	}
	void display() {
		result = num1 + num2;
		System.out.println("result = "+result);
	}
	//contructor overload
	abcd(int a,int b,int c){
		num1=a;
		num2=b;
		num3=c;
	}
}

public class Constructor {
	public static void main(String[] args) {
//		CONSTRUCTORS (method)
//		
//		same name as class name
//		never return anything
//		used to allocate memory and initialize object
// constructor overloading is same class name but different parameters 
		abcd obj = new abcd();
		System.out.println("default constructor");
		obj.display();

		abcd obj1=new abcd(10,20);
		System.out.println("parameterized constructor");
		obj1.display();
	}
}
