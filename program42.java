/*
    A
   AB
  ABC
 ABCD
ABCDE
*/

class program42
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
				System.out.print((char)(k+64));
			}
			System.out.println();
		}


	}
}