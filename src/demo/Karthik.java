package demo;

public class Karthik implements ISubstraction {

	int a=100;
	int b=200;
	int c=300;
	
	@Override
	public void substract() {

		System.out.println("Karthik doing substraction of 3 numbers " + (c-b-a));
	}

}
