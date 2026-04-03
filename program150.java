/*
15	13	10	6	1
	14	11	7	2
		12	8	3	
			9	4
				5

AO	FM	JJ	MF	OA
	BN	GK	KG	NB
		CL	HH	LC
			DI	ID
				EE

1	6	10	13	15
	2	7	11	14	
		3	8	12
			4	9
				5
*/

 class program150
{
	public static void main(String args[])
	{
		int n=5;
		int count1=1;
		int count2=(n*(n+1)/2);

		for(int i=n,i1=1 ; i>=1||i1<=n;i-- , i1++)
		{
			int c1=count1;
			int c2=count2;
			for(int j=i;j<n;j++)
			{
				System.out.print("\t");
			}
			for(int j=i,j1=i1;j>=1||j1<=n ; j--,j1++)
			{

				System.out.print((char)(c1+64));
				System.out.print((char)(c2+64));
				System.out.print("\t");
				c1+=j;
				c2-=j1+1;
			}
				System.out.println();
				count1++;
				count2-=i1;
		}
	}
}