/*
				15	
			10	14	
		6	9	13	
	3	5	8	12	
1	2	4	7	11

				EO
			IJ	DN
		LF	HI	CM
	NC	KE	GH	BL
OA	MB	JD	FG	AK			

				5
			9	4
		12	8	3
	14	11	7	2	
15	13	10	6	1
*/

 class program153
{
	public static void main(String args[])
	{
		int n=5;
		int count1=(n*(n+1)/2);
		int count2=(n*(n+1)/2);
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{	
				for(int j=n;j>i;j--)
					System.out.print("\t");
				for()
				System.out.print();
				System.out.print();
			}
		}

	}
}