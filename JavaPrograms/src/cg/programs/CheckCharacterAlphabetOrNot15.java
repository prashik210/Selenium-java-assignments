package cg.programs;

import java.util.Scanner;

public class CheckCharacterAlphabetOrNot15 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
		String s = sc.next();
		char c = s.charAt(0);
		
        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
        
        sc.close();
    }
}
