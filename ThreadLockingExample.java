package practice.threads;

public class ThreadLockingExample {
	
	public static void main(String[] args) {
		
		SynchronizationExample threadEx = new SynchronizationExample();
		//Create multiple thread and all the threads will try to access same object
		Thread thread1 = new Thread(()->{
			threadEx.task1WithSynchronizedMethod();
		});
		
		Thread thread2 = new Thread(()->{
			threadEx.task2WithSynchronizedBlock();
		});
		
		Thread thread3 = new Thread(()->{
			threadEx.task3WithoutSynchronization();
		});
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
class SynchronizationExample {
	public synchronized void task1WithSynchronizedMethod() {
		
		System.out.println("Inside task1 method");
		try {
			System.out.println("Task 1 started");
			Thread.sleep(1000);//Timed waiting
			System.out.println("Task 1 end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void task2WithSynchronizedBlock() {
		System.out.println("Inside Task 2 method");
		synchronized(this) {
			System.out.println("Inside Task 2 synchronized block");
		}
	}
	
	public void task3WithoutSynchronization() {
		System.out.println("Inside task 3");
	}
}