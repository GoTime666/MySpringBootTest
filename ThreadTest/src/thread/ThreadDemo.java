package thread;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread1 t1=new MyThread1("我的线程1");
		t1.start();
		for(int i=1;i<100;i++)
			System.out.println("主线程:   "+i);
	}
}
