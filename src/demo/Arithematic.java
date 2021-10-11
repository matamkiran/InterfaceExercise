package demo;

public class Arithematic implements IAddition,ISubstraction,IMultiplication {

	int a=100;
	int b=200;
	@Override
	public void add() {
		System.out.println(a+b);
	}
	@Override
	public void substract() {
		System.out.println(a-b);
	}
	@Override
	public void multiplication(int a, int b) {
		
		System.out.println(this.a*this.b);

	}

	

}
