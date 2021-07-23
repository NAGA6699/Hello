/*write a program to create 2 static methods and call from main methods */
class Method2
{
	public static void main(String[] args) 
	{
		System.out.println("Method starts....");
        bike();
		car();
		System.out.println("Method ends.");
	}
	public static void bike()
	{
		System.out.println("Start");
	}
	public static void car()
	{
		System.out.println("car start");
	}
}
