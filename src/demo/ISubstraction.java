package demo;

public interface ISubstraction {
	
	void substract();
	
	default void hello() {
		
		System.out.println("hello");
		
	}

}
