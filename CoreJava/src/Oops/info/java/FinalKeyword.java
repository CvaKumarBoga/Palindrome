package Oops.info.java;

public class FinalKeyword {
final static int a=10;
final static int b=20;
final int c;
int d;
	public FinalKeyword() {
		c=12;
		int a=15;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	final void show(final int x,final int y) {
		d=50;
		final int n=90;
		System.out.println(d+a);
		System.out.println(n);
		System.out.println(x*y);
	}
class Demo extends FinalKeyword {
     void show1() {
	
}
}
	public static void main(String[] args) {
		FinalKeyword fk=new FinalKeyword();
		fk.show(3,3);
	}

}
