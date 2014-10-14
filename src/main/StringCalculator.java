package stringcalc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.princeton.cs.introcs.*;

public class StringCalculator {
//Starting over - the libs are being a pain in the ass...
	public static void main(String[] args) {
		String text = StdIn.readString();
		StdOut.println(add(text));
	}
	
	public static int add(String numbers) {
		if (numbers.equals("")) {
			return 0;
		}
		else if (numbers.startsWith("//")) {
			return sum(specificDelimiter(numbers));
		}
		else if (numbers.contains(",") || numbers.contains("/n")) {
			return sum(split(numbers));
		}
		else {
			return Integer.parseInt(numbers);
		}
	}
	// Calculating the sum ---------------------------
	private static int sum(String[] stringnumbers) {
		int sum = 0;
		for (int i = 0; i < stringnumbers.length; i++) {
			sum += Integer.parseInt(stringnumbers[i]);
		}
		return sum;
	}
	// If there is a specific delimiter, determine the delimiter using regex
	// and split using that specific delimiter
	private static String[] specificDelimiter(String specific) {		
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(specific);
		m.matches();
		String delimiter = m.group(1);
		String numbers = m.group(2);
		return numbers.split(delimiter);
	}
	// Standard split with comma or newline (or both)
	private static String[] split(String numbers) {
		String[] split = null;
		
			if (numbers.contains(",") && numbers.contains("/n")) split = numbers.split(("/n|\\,"));
			else if (numbers.contains(",") && !(numbers.contains("/n"))) split = numbers.split(",");
			else if (numbers.contains("/n") && !(numbers.contains(","))) split = numbers.split("/n");
		
		return split;
	}

}
