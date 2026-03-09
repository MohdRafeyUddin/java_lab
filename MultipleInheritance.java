interface A
{
	void displayA();
}

interface B
{
	void displayB();
}

class C implements A,B
{
	public void displayA(){
		System.out.println("This is display A");
	}
	public void displayB(){
		System.out.println("This is display B");
	}
}

class MultipleInheritance
{
	public static void main(String[] args) 
	{
		C obj = new C();
		obj.displayA();
		obj.displayB();
	}
}
