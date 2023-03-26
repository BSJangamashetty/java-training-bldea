package training_codes;
import java.util.Scanner;
public class ArrayCode1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of the Students:");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the marks of the Student " +(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println("--------");
		for(int i=0;i<n;i++)
		{
			System.out.println("The marks of the Student " +(i+1) +" is:" +arr[i]);
		}
	}

}
