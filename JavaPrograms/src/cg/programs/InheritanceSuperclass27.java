package cg.programs;

class Animal2 {
  // field and method of the parent class
  String name;
  public void eat() {
    System.out.println("I can eat");
  }
}

// inherit from Animal
class Dog2 extends Animal2 {

  // new method in subclass
  public void display() {
    System.out.println("My name is " + name);
  }
}

public class InheritanceSuperclass27 {
	public static void main(String[] args) {
		// create an object of the superclass
	    Animal2 labrador = new Dog2();

	    // access field of superclass
	    labrador.name = "DogName";
	    //cannot call method of subclass
	    // using object of subclass 
	    //labrador.display();

	    // call method of superclass
	    // using object of subclass
	    labrador.eat();
	}
}
