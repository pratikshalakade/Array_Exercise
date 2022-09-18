package com.prowings.array;

import java.util.Arrays;

public class AssendingOrder 
{
	public static void main(String[] args) 
	{
		int temporary,i,j;
		int[] num= {10,30,20,40,60};
			
		for(i=0;i<num.length;i++) 
		{
			for(j=i;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					temporary=num[i];
 				    num[i]=num[j];
					num[j]=temporary;
				}
			}
		}
		for(int n:num)
		{
			System.out.println(n);
		}
	}

}
