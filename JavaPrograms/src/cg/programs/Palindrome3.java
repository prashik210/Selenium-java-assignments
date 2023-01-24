package cg.programs;

import java.util.Scanner;

public class Palindrome3 {
	
	public static boolean isPalindrome(String str)
    {
        // Initializing an empty string to store the reverse
        // of the original str
        String rev = "";
 
        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
 
        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check : ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		if(isPalindrome(s))
		{
			System.out.println("String is a palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
		sc.close();

	}

}
