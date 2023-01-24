package cg.programs;

class Parent2 {
    // Static method in base class
    // which will be hidden in subclass
    void m1()
    {
        System.out.println("From parent "
                           + "non-static m1()");
    }
  
    // Non-static method which will
    // be overridden in derived class
    void m2()
    {
        System.out.println("From parent "
                           + "non-static(instance) m2()");
    }
}
  
class Child2 extends Parent2 {
    // This method hides m1() in Parent
    void m1()
    {
    	super.m1();
        System.out.println("From child non-static m1()");
    }
  
    // This method overrides m2() in Parent
    @Override
    public void m2()
    {
    	super.m2();
        System.out.println("From child "
                           + "non-static(instance) m2()");
    }
}


public class InheritaceOverridingWithSuper30 {
	public static void main(String[] args) {
		Parent2 obj1 = new Child2();
		Parent2 obj2 = new Parent2();
		  
        // hides parent class m1() 
        obj1.m1();
  
        // Here overriding works
        // and Child's m2() is called
        obj1.m2();
        
        obj2.m1();
        obj2.m2();

	}
}
