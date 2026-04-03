/*
1	3	6	10	15
2	5	9	14
4	8	13
7	12
11

Ka	Lc	Mf	Nj	Oo
Gb	He	Ii	Jn
Dd	Eb	Fm
Bg	Cl
Ak


11	12	13	14	15
7	8	9	10
4	5	6
2	3
1
*/


class program149
{
	public static void main(String arg[])
	{
		int n=5;
		int count1=(n*(n-1)/2)+1;
		int count2 =1;

		for(int i=n,i1=1;i>=1||i1<=n;i--,i1++)
		{
			int c1=count1;//11
			int c2=count2;//1
			for(int j=i,j1=i1;j>=1||j1<=n;j--,j1++)
			{
				System.out.print((char)(c1+64));//11	12131415
				System.out.print((char)(c2+96));
				System.out.print("\t");
				c1++;
				c2+=j1+1;
			}
			System.out.println();
			count1-=i-1;//11-(5-1)   , 7-(4-1)
			count2+=i1;
		}
		
	}
}