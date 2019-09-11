package callableAndThreadpool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Object> {

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		for(int i=1;i<100;i++)
			System.out.println(Thread.currentThread().getName()+"   "+i);
		return null;
	}

}
