package Forloopdemo;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ForLoop fp = new ForLoop();
          fp.loopfordemo();
	}
public void loopfordemo()
{
   int total=0;
   int count=0;
   int addition =0;
	for(int i=1;i<=8;i++)
		
	{
		System.out.println(total);
       total=total+2;
       addition =addition+total;
       count++;
	}
	System.out.println( "count is"+count);
	System.out.println("addition is "+addition);
	
	
}
}

