package Quesion_three;
 
public class WrapperClassConvert 
{

	public static void main(String[] args) 
	{
		int num = 10;
		System.out.println("After convertion : " + convertToWrapper(num));
	}

	public static Object convertToWrapper(Object value)
	{

		Class valueClass = value.getClass();
		
		if (value == null || valueClass.isPrimitive())
		{
			System.out.println("Enter valid primitive as input");
		}
		
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
