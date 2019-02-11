package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryConversion {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter decimal number");
		int input = Integer.parseInt(in.readLine());
		String output = "";
		boolean negNumber = false;
		
		if(input < 0)
		{
			input = -1*input;
			negNumber = true;
		}
		
		while(input>0)
		{
			int remainder = input % 2;
			output = output+remainder;
			input = input/2;
		}
		
		if(negNumber)
		{
			output = "-"+output;
		}
		
		System.out.println("binary representation is '"+output+"'");
	}

}
