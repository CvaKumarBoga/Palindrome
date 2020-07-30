package Oops.info.java;
class Parent {
	int a=10;
	int b=20;
	void m4() {
		System.out.println("This is m4 method");
	}
}
class child extends Parent {
	int c=30;
	int a=40;
	int d=100;
	void m1() {
		System.out.println("This is m1 method");
	}
	void m2() {
		System.out.println("This is m2 method");
		System.out.println(super.a);
	}
}
class ThisKeyword extends child {
	int d=50;
	int b=60;
	void m3() {
		System.out.println("This is m3 method");
	}
	void show() {
		int d=100;
		System.out.println("This is method");
		Parent p=new Parent();
		System.out.println(p.a); 
		System.out.println(p.b);
		System.out.println(super.c);
		System.out.println(super.a);
		System.out.println(this.d);
		System.out.println(d);
		m1();
		this.m2();
		m3();
		m4();
		
	}
	void shoe() {
		System.out.println("This is shoe method");
	}
	public static void main(String[] args) {
		ThisKeyword td=new ThisKeyword();
		td.show();

	}

}
