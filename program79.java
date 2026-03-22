/*
11	7	4	2	1
12	8	5	3
13	9	6
14	10
15
*/

class program79
{
	public static void main(String args[])
	{
		int n=5;
		int count =11;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=i;j<=n;j++)
			{
				System.out.print(c+"\t");
				c-=j-1;
			}
			System.out.println();
			count++;
		}
	}
}