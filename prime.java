package tamilnadu.app;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Gcd gg= new Gcd();
         gg.Gcd1(12,30);
         gg.Gcd2(68,128);
         
	}
public void Gcd1(int a,int b)
{
	int div =2;
	while (div<b)
	{
		if (a%div==0 &&b%div==0) {
			System.out.println(div);
		}
		div++;
	}
System.out.println(div);
}
public void Gcd2(int c,int d)
{
	int div =2;
	while (div<d)
	{
		if (c%div==0 &&d%div==0) {
			System.out.println(div);
		}
		div++;
	}
System.out.println(div);
}
}

