package com.prowings.array;

import java.util.Arrays;
public class SortArray
{
	public static void assendingOrder() 
	{
		int temporary, i,j;
		int[] num= {100,50,30,-80,20,90};
		
		for(i=0; i<num.length; i++) 
		{
			for(j=i; j<num.length; j++) 
			{
			    if(num[i] > num[j]) 
				
		//		 if(num[i] < num [j])
				{
					temporary = num[i];
					num[i] = num[j];
					num[j] = temporary;
				}
			}
		}
		
		System.out.println("assending order is an bellow");
	//	System.out.println("dessending order is an bellow");
		
		for (int n : num)
		{
			System.out.println("\t" +n);
		}
	}
			
	public static void main(String[] args) 
	{
		assendingOrder();
     	
	}

}
