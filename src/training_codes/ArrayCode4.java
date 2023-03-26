package training_codes;
import java.util.Scanner;
public class ArrayCode4 
{
	public static int LinearSearch(int arr[],int key)
	{
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return(i+1);
			}
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		int key=sc.nextInt();
		int arr[]= {16,30,25,68,40,15,78,144,71,8};
		int res= LinearSearch(arr,key);
		if(res>0)
		{
			System.out.println("Element found in position " + (res));
		}
		else
		{
			System.out.println("Element not found");
		}
	}

}
