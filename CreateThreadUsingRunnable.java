package practice.threads;

public class CreateThreadUsingRunnable {
	
	public static void main(String [] args) {
		System.out.println("Inside main method :: "+Thread.currentThread().getName());
		ThreadExample threadEx= new ThreadExample();
		Thread threadObj = new Thread(threadEx);
		threadObj.start();
		
	}

}


class ThreadExample implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside run method :: "+Thread.currentThread().getName());
		System.out.println("Thread created using runnable interface");		
	}
	
}
