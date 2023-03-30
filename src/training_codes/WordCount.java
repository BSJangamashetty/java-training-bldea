package training_codes;
import java.util.Scanner;
public class WordCount 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')&&(i>0)||(str.charAt(i)==' ')&& (i==0))
			{
				count++;
			}
		}
		System.out.println("Number of words in a string:"+count);
	}
}
