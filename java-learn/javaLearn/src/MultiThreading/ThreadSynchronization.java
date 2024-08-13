package MultiThreading;

class Counter {
	private int count;

	public synchronized void increment() {
		count = count + 1;
	}

	public int getCount() {
		return count;
	}
}

public class ThreadSynchronization {
	public static void main(String[] args) throws InterruptedException {
//		(Thread safe (synchronized keyword))
		Counter c = new Counter();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5000; i++) {
				c.increment();
				
			}
		});
		t1.start();

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5000; i++) {
				c.increment();
				
			}
		});
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(c.getCount());
	}
}
