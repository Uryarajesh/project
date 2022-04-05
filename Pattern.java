package tamilnadu.chennai;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Pattern pa =new Pattern();
       pa.designM();
      // pa.design1();
	}
private void designM() 
{
  
	for (int row=1;row<=6;row++)
	{ 
			System.out.println("*");
		for(int col=1;col<=row;col++)
		{
	System.out.print(" ");
		}
	System.out.print("*");
	for(int col=row;col<5;col++)
{
	System.out.print(" ");
}
	System.out.print("*");
	for(int col=0;col<row;col++)
	{
		System.out.print(" ");
	}
	System.out.print("*");
	System.out.println();
	

	}
	}
}














