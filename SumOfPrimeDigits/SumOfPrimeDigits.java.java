package Java_Programs;
import java.util.*;
public class SumOfPrimeDigits {
	public static String sumOfPrimeDigits(int input1)
	{	
		//1234561179

		int a=input1;
		int i=0,n=0,m=0,sum=0,u=0;
		int k=a;
		int flag=0;
		String b=Integer.toString(a);
		Vector<Integer> s =new Vector<Integer>();
		Vector<Integer> np =new Vector<Integer>();
		for(int l=0;l<b.length();l++)
		{
			int t=a%10;
			s.add(t);
			a=a/10;
		}
		for(int j=0;j<s.size();j++)
		{
			n=s.elementAt(j);
		
			m=n/2;      
			if(s.elementAt(j).equals(0)||s.elementAt(j).equals(1))
			{  
				np.add(n);
			}
			else
			{  
				for(i=2;i<=m;i++)
				{      
					if(n%i==0)
					{  
						np.add(n);
						flag=1;      
						break;      
					}      
				}  
			 	if(flag==0)
			 	{
			 		sum=sum+n;
			 		u=u*10+n;
			 	}  
			}
			k=k/10;
			
		}
		if(sum==0)
		{
			String a1=Integer.toString(np.firstElement());
			String a2=Integer.toString(np.lastElement());
			String npi=(a2+":"+a1);
			return npi;
			
		}
		
		
			String be=Integer.toString(u);
			StringBuffer bi = new StringBuffer(be);
			String p=(bi.reverse()+":"+sum);
			return p;
	}
public static void main(String args[])
{
	int h=14671111;
	String check=sumOfPrimeDigits(h);
	System.out.println(check);

}
}