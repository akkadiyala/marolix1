package selenium;

public class finalexample {
	class Parent {
	    public final void display() {
	        System.out.println("Parent class display method");
	    }
	}

	class Child extends Parent {
	    // This method cannot override the final display() method in the Parent class
	    // It will result in a compilation error
	    public void display() {
	        System.out.println("Child class display method");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Parent parent = new Parent();
	        parent.display(); // Output: Parent class display method
	        
	        Child child = new Child();
	        child.display(); // Compilation Error: Cannot override the final method from Parent class
	    }
	}
}
