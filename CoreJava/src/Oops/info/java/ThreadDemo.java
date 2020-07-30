package Oops.info.java;

public class ThreadDemo implements Runnable {
int seats;
	public ThreadDemo(int seats) {
		this.seats=seats;
		
	}
	public void run() {
	  Thread t=Thread.currentThread();
	  String name=t.getName();
	  System.out.println(name+ " NO of seats before alloted:"+seats);
		if(seats>0) {
			try {
				Thread.sleep(2000);
				System.out.println("seats alloted student:"+name);
				seats=seats-1;
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
			else {
				System.out.println("Seats not alloted to:"+name);
			}
				System.out.println(name+ " No of seats after allocated:"+seats);
	
		}

	public static void main(String[] args) {
		ThreadDemo th=new ThreadDemo(50);
		
		Thread t1=new Thread(th);
		Thread t2=new Thread(th);
		t1.setName("Student1");
		t2.setName("Student2");
		t1.start();
		t2.start();
	}

}
