package Oops.info.java;

class ShowRoom extends Thread {
int value;
boolean flag=true;
	public synchronized void run(int i ) {
		if(flag==true) {
			value =i;
			System.out.println("Product value:"+i);
			notify();
			flag=false;
		}
			try {
				wait();
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
	}
	public synchronized int consume() {
		if(flag==true) {
			try {
				wait();
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		notify();
		flag=true;
		return value;
	}
}

class Producer extends Thread {
	ShowRoom s;
	Producer(ShowRoom s) {
		this.s=s;
	}
	public void run() {
		int i=1; 
		while(true) {
			i=i+1;
			try {
				Thread.sleep(200);
			}
			catch(InterruptedException ie) {
				System.out.println(ie);
			}
		}
		
	}
}
class Customer extends Thread {
	ShowRoom s;
	Customer(ShowRoom s) {
		this.s=s;
	}
	public void run() {
		while(true) {
			int x=s.consume();
			System.out.println("Consumed value:"+x);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ie) {
				System.out.println(ie);
			}
		
		}
	}
}
public class ProductCustiomer {
	public static void main(String[] args) {
	ShowRoom sr=new ShowRoom();
	
	Producer p=new Producer(sr);
	Customer c=new Customer(sr);
	 
	Thread t1=new Thread(p);
	Thread t2=new Thread(c);
	t1.start();
	t2.start();
}
}

