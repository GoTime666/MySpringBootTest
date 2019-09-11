package thread;

public class MyThread1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int i=1;i<100;i++)
			System.out.println(currentThread().getName()+"     "+i);
	}
	
	public MyThread1(String name) {
		this.setName(name);
	}
	public MyThread1() {
		
	}
	
}
