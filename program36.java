/*
    1
   12
  123
 1234
12345
*/

class program35
{
	public static void main(String arg[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}

	}
}