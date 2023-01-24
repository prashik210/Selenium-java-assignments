package cg.programs;

interface Phone
{
    void dial_number(String number); //abstract method 1
    void disconnectCall(); //abstract method 2
}

//Implementing class 1
class MobilePhone implements Phone
{
  public void dial_number(String number)
  {
      System.out.println("Connecting to mobile number: " +number);
  }
  public void disconnectCall()
  {
      System.out.println("Disconnected the call on mobile!");
  }
}

//Implementing class 2
class Landline implements Phone
{
  public void dial_number(String number)
  {
      System.out.println("\nConnecting to Landline number: " +number);
  }
  public void disconnectCall()
  {
      System.out.println("Disconnected the call on Landline!");
  }
}

public class InterfaceMain25 {
	public static void main(String[] args)
    {
        //Phone p = new Phone();
        //Error! cannot instatiate an interface
 
        Phone p; //reference type variable  
        p = new MobilePhone();
        //calling methods of class MobilePhone using reference
        p.dial_number("+91 7042176752");
        p.disconnectCall();
 
        //OR (Another Way)- create object for the implementing class
        Landline l = new Landline();
        //calling methods of class Landline using class object
        l.dial_number("011 2042176752");
        l.disconnectCall();
    }
}
