/*
11111
 2222
  333
   44
    5
*/

class program48
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}