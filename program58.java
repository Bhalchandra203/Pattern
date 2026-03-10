/*
EDCBA
 EDCB
  EDC
   ED
    E
*/

class program58
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++ )
		{
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print((char)(k+64));
			}
			System.out.println();	
		}	
	}
}
  