package javainterface;

public interface Student {
	
	void eat();
	void run();

}

class Teacher implements Student {

    public void eat() {
        System.out.println("Teacher is eating");
    }

    public void run() {
        System.out.println("Teacher is running");
    }
    
    public static void main(String[] args) {

        Teacher t = new Teacher();

        t.eat();
        t.run();
    }

}


   
