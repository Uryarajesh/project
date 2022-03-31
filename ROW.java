package Forloopdemo;

public class ROW {
	
	public static void main (String []args)
	{
		ROW rr=new ROW();
		  rr.Row();
		  rr.Row1();
		  rr.Row2();
		  rr.Row3();
	}
public void Row()
{
for(int row=5;row>=1;row--)	
{
for(int col=1;col<=row;col++)
	System.out.print(row%col);
System.out.println();
}
}
public void Row1()
{
for(int row=5;row>=1;row--)	
{
for(int col=1;col<=row;col++)
	System.out.print(row*col);
System.out.println();
}
}
public void Row2()
{
for(int row=5;row>=1;row--)	
{
for(int col=1;col<=row;col++)
	System.out.print(row+col);
System.out.println();
}
}
public void Row3()
{
for(int row=5;row>=1;row--)	
{
for(int col=1;col<=row;col++)
	System.out.print(row-col);
System.out.println();
}
}
}
