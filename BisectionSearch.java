package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
public class BisectionSearch {
	
	public static void main(String[] args)
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter number");
			double input = Double.parseDouble(in.readLine());
			
			double epsilon = 0.01;
			double low = 0.0;
			double high = input;
			double ans = (low+high)/2;
			double newGuess = 1.0;
			
			while(Math.abs(ans-input) >= epsilon)
			{
				System.out.println("Number of guesses :"+newGuess+" , low :"+low+", high:"+high+", ans = "+ans);
				newGuess += 1;
				
				if((ans*ans) < input)
				{
					low = ans;
				}
				else
				{
					high = ans;
				}
				
				ans = (low+high)/2;
			}
			
			System.out.println("square root of '"+input+"' is '"+ans+"'");

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
