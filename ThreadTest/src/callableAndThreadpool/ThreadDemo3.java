package callableAndThreadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import runnable.MyRunnable;

public class ThreadDemo3 {
	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(2);
		MyRunnable r=new MyRunnable();
		service.submit(r);
		service.submit(r);
		service.submit(r);
		service.submit(r);
		
		MyCallable c=new MyCallable();
		 
	}
	
	
}
