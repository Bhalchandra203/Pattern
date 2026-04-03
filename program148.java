/*
15
13	14
10	11	12
6	7	8	9
1	2	3	4	5

Ko
Lm	Gn
Mj	Hk	Dl
Nf	Ig	Eh	Bi
Oa	Jb	Fc	Cd	Ae

11
12	7	
13	8	4
14	9	5	2
15	10	6	3	1

*/


class program148
{
	public static void main(String args[])
	{
		int n=5;
		int count1=(n*(n-1)/2)+1;//11
		int count2=(n*(n+1)/2);
		for(int i=n,i1=1;i>=1||i1<=n;i--,i1++)
		{
			int c1=count1;//11	
			int c2=count2;
			for(int j=i,j1=i1;j<=n||j1>=1;j++,j1--)//5
			{	
				System.out.print((char)(c1+64));//11
				System.out.print((char)(c2+96));	
				System.out.print("\t");//
				c1-=j+1;
				c2++;
				
			}
			System.out.println();
			count1++;
			count2-=i1+1;
		}
	}
}