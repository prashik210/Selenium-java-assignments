package cg.programs;

import java.util.Scanner;

public class Fibonacci2 {
	
	// Function to print N Fibonacci Number
    static void fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
  
        int counter = 0;
  
        // Iterate till counter is N
        while (counter < N) {
  
            // Print the number
            System.out.print(num1 + " ");
  
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms in fibonacci series : ");
        int number= sc.nextInt();
  
        fibonacci(number);
        
        sc.close();
	}

}
