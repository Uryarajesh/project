package tamil.chennai;

import java.util.Scanner;

public class JavaScanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     JavaScanner1 we = new JavaScanner1();
      we.test();
	}

	private void test() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  name");
		String s = sc.next();
		System.out.println("enter the value");
		int i = sc.nextInt();
		System.out.println("exp");
		float f =sc.nextFloat();
		System.out.println("duble");
		double d = sc.nextDouble();
		System.out.println("bookean");
		boolean b = sc.nextBoolean();
		System.out.println("long");
		long l = sc.nextLong();
		System.out.println("byte");
		byte da =sc.nextByte();
		System.out.println("short");
		Short sd = sc.nextShort();		
	}

}
