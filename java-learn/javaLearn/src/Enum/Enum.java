package Enum;

enum shape {
	// 0          1           2
	CIRCLE(0), TRIANGLE(3), SQUARE(4);

	private int slides;

	private shape() {
		System.out.println("constructors called");
	}

	private shape(int i) {
		slides = i;
	}
	public int getSlides() {
		return slides;
	}
}

public class Enum {
	public static void main(String[] args) {
//		1.Enum (Group of named constants) Basics
//		2.Comparing constants using if else and switch
//		3.Enum class
		shape obj = shape.CIRCLE;
		System.out.println(obj);
		shape obj1 = shape.SQUARE;
		System.out.println(obj1);
		System.out.println(obj1.ordinal());// index value
		shape[] obj2 = shape.values();
		for (shape val : obj2) {
			System.out.println(val);
		}

		if (obj == shape.CIRCLE) {
			System.out.println("no side");
		} else if (obj == shape.SQUARE) {
			System.out.println("four sides");
		} else if (obj == shape.TRIANGLE) {
			System.out.println("three sides");
		} else {
			System.out.println("wrong");
		}

		switch (obj1) {
		case CIRCLE:
			System.out.println("no side");
			break;
		case SQUARE:
			System.out.println("four sides");
			break;
		case TRIANGLE:
			System.out.println("three sides");
			break;
		default:
			System.out.println("wrong");
		}

		System.out.println(obj.getClass());
		System.out.println(obj.getClass().getSuperclass());
		
		System.out.println(obj.getSlides());
		System.out.println(obj1.getSlides());
		
	}
}
