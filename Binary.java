package tamilnadu.app;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Binary bb = new Binary();
          bb.binaryd();
        bb.dicimalb(5);
	}
	public void binaryd()
	{
		int binary=101;
		int rem =0;
		int pow=0;
		double dicimal = 0;
		while(binary>0)
		{
			rem=binary%10;
			dicimal = dicimal+(rem* Math.pow(2,pow));
			 
			binary =binary/10;
			pow++;
		}
		System.out.println(dicimal);
	}
	private void dicimalb(int a) {
	int purse=a;
	String binary="";
	while(purse>0) {
		binary=(purse%2)+binary;
			purse = purse/2;
	}
	System.out.println(binary);
	}		
}


