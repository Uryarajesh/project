package tamilnadu.chennai;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Array aa=new Array();
        aa.ademo();
	}
public void ademo()
{
	Scanner sc =new Scanner(System.in);
	System.out.println("no of count");
	int count =sc.nextInt();
 int[] marks = new int[count];
 System.out.println(marks.length);
 int total=marks.length;
 for(int i=0;i<=marks.length;i++)
 {
	
	 System.out.println("enter the mark");
	 marks[i]=sc.nextInt();
	
 }
 for(int i=0;i<=marks.length;i++)
 {
	 System.out.println(marks[i]);
	 total=total+marks[i];
 }
 System.out.println(total);
	
	
}
}

