package javaLearn;

public class UncontionalStatement {
//	break,continue(keywords) - used in iterative statements (loops)
	
//	break - whenever control reaches break, it comes out from the loop it is also used with switch
	
//	continue - whenever control reaches continue , it comes out only from the current iteration
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) { // i=i+1
			if(i==5) {
//				break;
				continue;
			}
			System.out.println("hello "+i);
		}
		System.out.println("bye");
	}
}
