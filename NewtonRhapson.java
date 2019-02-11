package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
public class NewtonRhapson {
	
	public static void main(String [] args) throws NumberFormatException, IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter value of output for equation x^3+5");
		double input = Double.parseDouble(in.readLine());
		int numberOfguess = 0;
		double epsilon = 0.01;
		double intialGuess = input/2.0;
	
		while(Math.abs((intialGuess*intialGuess*intialGuess +5)-input) >= epsilon)
		{
			numberOfguess += 1;
			intialGuess = intialGuess - (((intialGuess*intialGuess*intialGuess +5)-input)/(3*intialGuess*intialGuess)); // g-(eq)/(eq)'
		}
		
		System.out.println("number of guesses :"+numberOfguess+" , root the equation is "+intialGuess);
	}
}
