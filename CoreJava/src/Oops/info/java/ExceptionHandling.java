package Oops.info.java;
public class ExceptionHandling {

	public static void main(String[] args) {
		try {
	String s1=args[0];
	String s2=args[1];
	int a=Integer.parseInt(s1);
	int b=Integer.parseInt(s2);
	System.out.println(a/b);
	}
		catch(ArrayIndexOutOfBoundsException aie) {
			aie.printStackTrace();
		}
	}
}
