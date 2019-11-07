/**************************************************************
*
* Rule 03, NUM 04 
* 
* Do not use floating-point numbers if 
* precise computation is required
*
* Completed on 11_7_2019
*
**************************************************************/


public class R03_NUM04_J {

	public static void main(String[] args)
	{
		System.out.println("This is what happens when floating point is used\nwhen high precision is needed");
		nonCompliantMethod();
		System.out.println("\nThis is the proper way to perform the calculation: ");
		compliantMethod();

	}
	
	//this method leaves floating point values when high precision is needed
	public static void nonCompliantMethod()
	{
		double dollar = 1.00;
		double dime = 0.10;
		int number = 7;
		System.out.println(
				"A dollar less " + number + " dimes is $" + (dollar - number * dime) 
				);
		
	}
	
	//this is the proper way to handle numbers to prevent floating point errors.
	public static void compliantMethod()
	{

		int dollar = 100;
		int dime = 10;
		int number = 7;
		System.out.println(
				"A dollar less " + number + " dimes is $0." + (dollar - number * dime)
				);
		
	}
	
}
