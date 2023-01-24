package cg.programs;

public class Swap2Numbers20 {

	public static void main(String[] args) {
		
		swapUsingTemporaryVariable();
		swapWithoutusingTempVariable();

	}

	private static void swapWithoutusingTempVariable() {
		 	float first = 12.0f, second = 24.5f;

	        System.out.println("--Before swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);

	        first = first - second;
	        second = first + second;
	        first = second - first;

	        System.out.println("--After swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);
		
	}

	private static void swapUsingTemporaryVariable() {
		float first = 1.20f, second = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
		
	}

}
