package cg.programs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ConvertStringToDate23 {

	public static void main(String[] args) {
		convertUsingPredefinedDateTimeFormatter();
		convertUsingPatternFormatter();

	}

	private static void convertUsingPatternFormatter() {
		String string = "July 25, 2017";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);

        System.out.println(date);
		
	}

	private static void convertUsingPredefinedDateTimeFormatter() {
		String string = "2017-07-25";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println(date);
		
	}

}
