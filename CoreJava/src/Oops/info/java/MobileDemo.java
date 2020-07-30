package Oops.info.java;

class Oppo {
	String color;
	String cost;
	String model;
	void show(int x)
	{
		System.out.println("This is Oppo abstract method");
	}
}
	abstract class Samsung extends Oppo {
		String type;
		String discount;
		void show( String type) {
			System.out.println("This is samsung abstract method");
		}
	}
	public class MobileDemo extends Samsung {
		String ram;
		String memory;
		void show(int s)
		{
			System.out.println("This is  mobile demo inherit method");
		}
	public static void main(String[] args) {
		MobileDemo o=new MobileDemo();
		o.show(22);
		o.show("samsung");
}
	}
