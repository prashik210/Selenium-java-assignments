package cg.programs;


abstract class MotorBike {
  abstract void brake();
}

class SportsBike extends MotorBike {
  // implementation of abstract method
  public void brake() {
    System.out.println("SportsBike Brake");
  }
}

class MountainBike extends MotorBike {
    
  // implementation of abstract method
  public void brake() {
    System.out.println("MountainBike Brake");
  }
}

public class AbstractClass31 {
	
	public static void main(String[] args) {
		// cannot create object of abstract class
		// MotorBike m = new MotorBike();
		
		// cannot access unimplemented methods of abstract class
		// m.brake();
		
		 MountainBike m1 = new MountainBike();
		 m1.brake();
		 SportsBike s1 = new SportsBike();
		 s1.brake();		
	}
}
