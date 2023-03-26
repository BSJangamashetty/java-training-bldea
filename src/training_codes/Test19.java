package training_codes;

import java.util.Scanner;

public class Test19 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of the age:");
		int age = sc.nextInt();
		if(age<18)
		{
			System.out.println("You are still minor, Please Grow Up");
		}
		else if (age>65)
		{
			System.out.println("You are the senior citizen, Please stop over expectations");
		}
		else
		{
			System.out.println("You are in the list of eligible grooms");
		}

	}

}
