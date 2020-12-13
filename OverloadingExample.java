class OverloadingExample
{
	
		public void sum(int a,int b)
		{
			System.out.print("Method1 has been called");
			System.out.println("     Sum of numbers is "+(a+b));
		}
		
		public void sum(int a, int b, int c)
		{
			
			System.out.print("Method2 has been called");
			System.out.println("    Sum of numbers is "+(a+b+c));
		}
	
	
	
	public static void main(String args[])
	{
	
		OverloadingExample overloding=new OverloadingExample();
		
		
		overloding.sum(2,3);	//Calling method1 with 2 arguments
		
		overloding.sum(2,3,5);  //Calling method2 with 3 arguments
	
	}
}