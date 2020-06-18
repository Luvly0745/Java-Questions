class DistinctObjectInArray
{
	public static  int FindObject(int x[])
	{
		
		int d=0;
		for (int i = 0; i < x.length; i++) 
		{
		
			int j=0;
			for ( j = 0; j <i; j++) 
			{
			
               
				if(x[i]==x[j]) break;
				
				
			
			}
			if(i==j)
			{
				d++;
			}
		}

		return d;
	}
	
public static void main(String args[])
	{
		int x[]= {2,0,1,5,5,3};
		
		int u=Di(x);
		System.out.println(u);
	}
}