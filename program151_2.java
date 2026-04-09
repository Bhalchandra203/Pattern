 class program151_2
{
	public static void main(String args[])
	{
		int n=5;
		
		int count2=(n*(n+1)/2);

		for(int i1=1;i1<=n;i1++)
		{
			
			int c2=count2;
			for(int j1=n;j1>=1;j1--)
			{

				
				System.out.print((char)(c2+64));
				System.out.print("\t");
				
				c2-=j1;
			}
				System.out.println();
				
				count2--;
		}
	}
}