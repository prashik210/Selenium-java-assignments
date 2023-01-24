package cg.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList11 {

	public static void main(String[] args) {
		
		String[] array = {"Java", "Python", "C"};
	    System.out.println("Array: " + Arrays.toString(array));

	    // convert array to list
	    List<String> languages= new ArrayList<>(Arrays.asList(array));

	    System.out.println("List: " + languages);
	}

}
