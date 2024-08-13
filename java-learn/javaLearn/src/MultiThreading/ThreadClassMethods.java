package MultiThreading;

//1.join()->last sentence join			2.isAlive()->boolean
//3.getName()		4.setName()
//5.getPriority()	6.setPriority()  7.sleep()
public class ThreadClassMethods {
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}, "First Thread");// set name we can declare here also
		t1.start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});
		t2.start();
//		System.out.println(t1.isAlive());//true
//		t1.setName("thread 1");
//		System.out.println(t1.getName());

//		t1.setPriority(Thread.MAX_PRIORITY);
//		System.out.println(t1.getPriority()+" priority");

		t1.join();
//		System.out.println(t1.isAlive());//false
		t2.join();
		System.out.println("good evening");
	}
}
