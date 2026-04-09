/*
A
FB
JGC
MKHD
ONLIE

1
6   2
10  7  3
13
15
*/


class program109
{
	public static void main(String args[])	
	{
		int n=5;
		int count=1;
		for(int i=n;i>=1;i--)
		{
			int c=count;
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(c+64));
				c-=j;
			}	
			System.out.println();
			count+=i;
		}
	}
}