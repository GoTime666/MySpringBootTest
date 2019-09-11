package runnable;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<100;i++)
			System.out.println(Thread.currentThread().getName()+"   "+i);
	}

}
