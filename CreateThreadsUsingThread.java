package practice.threads;

public class CreateThreadsUsingThread {

	public static void main(String[] args) {
		ThreadExampleByUsingThread threadEx = new ThreadExampleByUsingThread();
		threadEx.start();
	}
}

class ThreadExampleByUsingThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Inside run method  :: "+ Thread.currentThread().getName());
	}
}
