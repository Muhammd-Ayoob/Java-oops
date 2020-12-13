class Animal
{
	public void voice()
	{
		System.out.println("Every animal has its own voice");
	}
}

class Dog extends Animal
{
	public void voice()
	{
		System.out.println("Dog has voice like bow bow");
	}
}

class Cat extends Animal
{
	public void voice()
	{
		System.out.println("Cat has void like mewoo");
	}
}

class OverridingExample
{
	public static void main(String args[])
	{
		Animal animal;
		animal=new Cat();
		
		animal.voice();
		
		animal=new Dog();
		animal.voice();
	}
}