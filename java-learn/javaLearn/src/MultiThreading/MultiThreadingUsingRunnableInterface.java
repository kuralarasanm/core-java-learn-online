package MultiThreading;

//class hi implements Runnable {

//	@Override
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("hi");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
//
//class hello implements Runnable {
//	@Override
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("hello");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
//
//public class MultiThreadingUsingRunnableInterface {
//	public static void main(String[] args) {
////		implementing Multithreading in java by
//////	   1. using Thread class
//////	   2. using Runnable Interface
////				(Functional interface) - Lambda expression
//		
//		Runnable obj = new hi();
//		Runnable obj1 = new hello();
//		Thread t1=new Thread(obj);
//		t1.start();
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//		}
//		Thread t2=new Thread(obj1);
//		t2.start();
//
//	}
//}

//public class MultiThreadingUsingRunnableInterface {
//	public static void main(String[] args) {

////		Runnable obj = new Runnable() {
////			@Override
////			public void run() {
////				for (int i = 0; i < 10; i++) {
////					System.out.println("hi");
////					try {
////						Thread.sleep(1000);
////					} catch (InterruptedException e) {
////					}
////				}
////			}
////		};
////		Runnable obj1 = new Runnable() {
////			@Override
////			public void run() {
////				for (int i = 0; i < 10; i++) {
////					System.out.println("hello");
////					try {
////						Thread.sleep(1000);
////					} catch (InterruptedException e) {
////					}
////				}
////			}
////		};
//		// or Lambda expression
//		Runnable obj = () -> {
//			for (int i = 0; i < 10; i++) {
//				System.out.println("hi");
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//				}
//			}
//		};
//		Runnable obj1 = () -> {
//			for (int i = 0; i < 10; i++) {
//				System.out.println("hello");
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//				}
//			}
//		};
//
//		Thread t1 = new Thread(obj);
//		t1.start();
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//		}
//		Thread t2 = new Thread(obj1);
//		t2.start();
//
//	}
//}
	//or
public class MultiThreadingUsingRunnableInterface {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});
		t1.start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});
		t2.start();
	}
}