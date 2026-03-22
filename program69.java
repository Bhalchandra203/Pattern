/*
5	
9	4
12	8	3
14	11	7	2
15	13	10	6	1
*/

class program69
{
	public static void main(String args[])
	{
		int n=5;
		int count =5;//9
		for(int i=n;i>=1;i--)//4>1
		{
			int c=count;
			for(int j=n;j>=i;j--)//5>=3
			{
				System.out.print(c+"\t");//9 ,
				c=c-j;//	
					
			}
			System.out.println();
			count+=i-1;
		}
	}
}


