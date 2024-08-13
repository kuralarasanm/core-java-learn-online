package UserInputUsingBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputUsingBufferedReader {
	public static void main(String[] args) throws IOException {

//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
		// or
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		System.out.println("Enter any message str");
//		String str = br.readLine();
//		System.out.println("your message " + str);
//		
//		System.out.println("enter your int num");
//		int num=Integer.parseInt(br.readLine());
//		System.out.println(num+2);

		System.out.println("enter your double num");
		double num1 = Double.parseDouble(br.readLine());
		System.out.println(num1);
	}
}
