package Abstraction;

abstract class Abstracts {
	public abstract void show();
}

//class Abstractext extends Abstracts {
//
//	@Override
//	public void show() {
//		System.out.println("in show");
//	}
//
//}

public class AbstractAnonymousInnerClass {
	public static void main(String[] args) {
//		Abstractext obj = new Abstractext();
//		obj.show();
		
		Abstracts obj=new Abstracts() {
			
			@Override
			public void show() {
				System.out.println("in show Abstract Anonymous InnerClass");
				
			}
		};
		obj.show();
	}
}
