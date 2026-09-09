package application;

import calculator.Calculator;

public class Main {
	
	public static void main(String [] data) {
		
		Calculator c = new Calculator();
		
		int n1 = 12 ; 
		int n2 = 23;
		
		
		c.add(n1,n2);
		c.div(n1,n2);
		c.multi(n1, n2);
		c.mod(n1, n2);
		c.sub(n1, n2);
		
		
		
		
		
	}

}
