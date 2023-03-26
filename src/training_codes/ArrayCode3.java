package training_codes;
import java.util.Scanner;
public class ArrayCode3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of movie houses:");
		int m = sc.nextInt();
		System.out.println("Enter the number of theatres");
		int t =sc.nextInt();
		System.out.println("Enter the number of screens");
		int s = sc.nextInt();
		int arr[][][]= new int [m][t][s];
		for(int i=0;i<m;i++)
		{
			System.out.println("Inside house" +(i+1));
			for(int j=0;j<t;j++)
			{
				System.out.println("Inside the theatre" +(j+1));
				for( int k=0;k<s;k++)
				{
					System.out.println("Enter the capacity of the Screen" +(k+1));
					arr[i][j][k]= sc.nextInt();
				}
			}
		}
		System.out.println("--------");
		for(int i=0;i<m;i++)
		{
			System.out.println("Inside house" +(i+1));
			for(int j=0;j<t;j++)
			{
				System.out.println("Inside the theatre" +(j+1));
				for( int k=0;k<s;k++)
				{
					System.out.println("The funds of that screen" +(k+1)+ "provides is" +(arr[i][j][k]*360));
				}
			}
		}

	}
}
