package training_codes;

import java.util.Arrays;

public class ArrayCode6 
{
	public static void main(String[] args) 
	{
		int arr1[]= {10,20,30,40,50,60,70,80,90};
		int arr2[]= {90,80,10,70,20,40,50,60,30};
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					System.out.println("Arrays are not equal");
					System.exit(0);
				}
			}
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
	}
}


