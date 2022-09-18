package com.prowings.array;

import java.util.Arrays;

public class SwapTwo 
{
	public static void SwapTwoArray()
	{
		int a[] = { 20,40,70,50,60,10 };
		int c;
		
		for ( int i=0; i<a.length; i++ )
		{
			for( int j=i; j<a.length; j++)
			{
				if (a[i] > a[j])
				{
					   c = a[i];
					a[i] = a[j];
					a[j] = c;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) 
	{
		SwapTwoArray();
	}

}
