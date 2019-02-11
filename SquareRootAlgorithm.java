package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareRootAlgorithm {
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Find square root of ?");
		int squaredNumber = Integer.parseInt(in.readLine());
		
		double seed = 9;
		double tolerance = 0.001;
		
		while(true)
		{
			double seedSquare = seed*seed;
			double diff = seedSquare-squaredNumber;
			
			if(diff<0)
			{
				diff = -1*diff;
			}
			
			if(diff<=tolerance)
			{
				System.out.println("square root of '"+squaredNumber+"' is '"+seed+"'");
				break;
			}
			else
			{
				double div = squaredNumber/seed;
				double avg = (div+seed)/2;
				seed = avg;
			}	
		}
		

//		System.out.println("Enter range of expected number from 0 to ?");
//		int lastNumber = Integer.parseInt(in.readLine());
//		for(int index = 1 ; index<=lastNumber ; index++)
//		{
//			int result = (int)squaredNumber/index ;
//			if(result==index)
//			{
//				System.out.println("square root of '"+squaredNumber+"' is '"+index+"'");
//				return;
//			}
//		}
//		
//		System.out.println("number '"+squaredNumber+"' is not a perfect square");
//		
	}
	
}
