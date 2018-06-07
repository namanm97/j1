package rkp;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1 t1=new thread1();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2 t2=new thread2();
		t2.start();
	}

}
