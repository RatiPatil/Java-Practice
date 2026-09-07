package javainterface;

public interface Animal {
	
	void eat();
	void bar();

}


class Dog implements Animal{

	public void eat() {
		System.out.println("Animal is barking");
	}
	
	
	public void bar() {
		System.out.println("Animal is barking");
	}

	
	
	public static void main(String [] args) {
		Dog d = new Dog();
		
		d.bar();
		d.eat();
	}
}
