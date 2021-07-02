package JavaDA3;

class java1 implements Runnable {
	 public int number1 = 10;
	 static int number2 = 2;
	 int div;
	 static Object lock = new Object();
	 java1(int div) {
		 this.div = div;
	 }
	 
	@Override
	public void run() {
		while (number2 < number1) {
			synchronized (lock) {
				while (number2 % 2 != div) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number2);
				number2++;
				lock.notifyAll();
			}
		}
	}
}

public class DA3Prog4 {
	public static void main(String[] args) {
		System.out.println("Yogeswari Sahu 18BCE0928 06-04-2021");
		java1 or=new java1(1);
		java1 er=new java1(0);
		Thread t1=new Thread(or,"Odd");
		Thread t2=new Thread(er,"Even");
		t1.start();
		t2.start();

	}

}
