/*
    E
   ED
  EDC
 EDCB
EDCBA
*/

class program44
{
	public static void main(String arg[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
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