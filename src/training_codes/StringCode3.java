package training_codes;
import java.util.Scanner;
public class StringCode3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string1:");
		String str1=sc.next();
		System.out.println("Enter the string:");
		String str2=sc.next();
		if(str1.equalsIgnoreCase(str2)==true)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
	}

}
