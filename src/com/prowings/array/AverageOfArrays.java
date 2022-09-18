package com.prowings.array;

public class AverageOfArrays 
{
	public static void average()
	{
		double sum =0;
		double avg;
		int[] num = {10,20,30,40,50,80};
		
		for (int i=0; i<num.length; i++)
		{
			sum+=num[i];
		}
		System.out.println(sum);
		
		avg = sum / num.length;
		System.out.println(avg);
		
	}
	public static void main(String[] args)
	{
		average();
	}

}
