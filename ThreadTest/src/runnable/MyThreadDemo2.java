package runnable;

public class MyThreadDemo2 {
	public static void main(String[] args) {
		Runnable r1=new MyRunnable();
		Thread t1=new Thread(r1,"Runnable建的线程1");
		t1.start();
		for(int i=1;i<100;i++)
			System.out.println("主线程:   "+i);
	}
}
