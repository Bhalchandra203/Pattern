/*

O
JN
FIM
CEHL
ABDGK


15
10  14
6   9
3
1
*/

class program112
{
	public static void main(String args[])	
	{
		int n=5;
		int count=(n*(n+1)/2);
		for(int i=n;i>=1;i--)
		{
			int c=count;
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(c+64));
				c+=j;
			}	
			System.out.println();
			count-=i;
		}
	}
}