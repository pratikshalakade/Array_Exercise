package com.prowings.array;
public class SecondHighest
{
	public static void secondHighestElement() 
	{
		int sechighest;
		int temporary,i,j;
		int[] num = { 10,30,40,20,55 };
		for (i=0; i<num.length; i++) 
		{
			for (j=i; j<num.length; j++) 
			{
				if (num[i] > num[i])  
				{
					temporary = num[i];
					num[i] = num[j];
					num[j] = temporary;
				}
			}
		}
		sechighest = num[num.length-2];
		System.out.println("second highest element is :" + sechighest);
	}
	public static void main(String[] args) 
	{
		secondHighestElement();
	}
}
