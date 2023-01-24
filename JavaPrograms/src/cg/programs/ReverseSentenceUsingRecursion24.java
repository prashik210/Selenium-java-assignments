package cg.programs;

import java.util.Scanner;

public class ReverseSentenceUsingRecursion24 {

	public static void maGin(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check : ");
		String sentence = sc.nextLine();

	    String reversed = reverse(sentence);
	    System.out.println("The reversed sentence is: " + reversed);
		
		sc.close();

	}

	public static String reverse(String sentence) {
	    if (sentence.isEmpty())
	      return sentence;

	    return reverse(sentence.substring(1)) + sentence.charAt(0);
	  }
}
