package assigment3;

import java.util.Scanner;

public class WrapperClassConvert 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sample Input : ");
		int num;
		num = sc.nextInt();
		System.out.println("After convertion : " + convertToWrapper(num));
	}

	public static Object convertToWrapper(Object value)
	{

		Integer temp_obj = Integer.valueOf((int) value);

		if (temp_obj instanceof Integer) 
		{
			return temp_obj;
		} 
		
		else 
		{
			System.out.println("Enter valid primitive as input");
		}

		return temp_obj;

	}
}

