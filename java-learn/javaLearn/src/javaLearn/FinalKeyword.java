package javaLearn;

class a{
	final void show(){
		
	}
}
final class b extends a{
	void show() {//error
		
	}
}
class c extends b{//error
	
}

public class FinalKeyword {
	public static void main(String[] args) {

//		Final (Variable , method , class)
//		variable -> used to declare as constant
//		method -> cannot be overridden
//		class -> cannot be inherited

		final int a = 5;
//		a=10; //error
		System.out.println(a);
	}
}
