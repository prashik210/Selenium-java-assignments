package cg.programs;

import java.util.Arrays;

public class ConvertCharacterToStringAndViceVersa7 {

	public static void charToString() {
		char ch = 'c';
        String st = Character.toString(ch);
        // Alternatively
        // st = String.valueOf(ch);

        System.out.println("The string is: " + st);
	}
	
	public static void charArrayToString() {
		char[] ch = {'a', 'e', 'i', 'o', 'u'};

        String st = String.valueOf(ch);
        String st2 = new String(ch);

        System.out.println(st);
        System.out.println(st2);
	}
	
	public static void stringToCharArray() {
		 String st = "This is great";

         char[] chars = st.toCharArray();
         System.out.println(Arrays.toString(chars));
	}
	
	public static void main(String[] args) {
		charToString();
		charArrayToString();
		stringToCharArray();
	}

}
