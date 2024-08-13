package javaLearn;

class Addition {
	public int add(int i, int j) {
		return i + j;
	}

	public int add(int i, int j, int k) {
		return i + j + k;
	}

	int sum = 0;

	// variable length aruguments--> ...
	public int add(int... i) {
		// enchanced for loop
		for (int val : i)
			sum += val;
		return sum;
	}

//	public int add(int a, int... i) {
//		// enchanced for loop
//		for (int val : i)
//			sum += val;
//		System.out.println(a);
//		return sum;
//	}
}

public class VariableAruguments {
	public static void main(String[] args) {
		Addition obj = new Addition();
		int result = obj.add(1, 10);
		System.out.println(result);
		int result1 = obj.add(1, 10, 20);
		System.out.println(result1);
		int result2 = obj.add(1, 2, 3, 4, 5, 6);
		System.out.println(result2);
	}
}
