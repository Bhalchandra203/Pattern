/*
edcba
 dcba
  cba
   ba
    a
*/

class program59
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i-- )
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print((char)(k+96));
			}
			System.out.println();	
		}	
	}
}
  