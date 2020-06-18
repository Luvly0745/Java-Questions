package Java_Question;

import java.util.*;


public class StepNumber
{
	public static String isStepNumber(int input1)
	{
		String f=input1+"-false";
		String t=input1+"-true";
		int c=0;
		String s = Integer.toString(input1);
		while(input1>0)
		{
			int a=input1%10;
			input1=input1/10;
			int b=0;
			
			b=input1%10;
			
			if(input1>0&&(a-b==-1||a-b==1||b-a==-1||b-a==1))
			{
				c++;
			}
		}
		if(s.length()==1)
		{			
			return f;
		}
	
		else
		{
				if(c==(s.length()-1)) return t;
				else return f;
				
		}
		
		
	}
	
	
	public static void main(String args[])
	{
		
		int input=67898;
		String test=isStepNumber(input);
		System.out.println(test);
	
	}
}