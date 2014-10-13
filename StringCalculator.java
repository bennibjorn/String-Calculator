package stringcalc;

import edu.princeton.cs.introcs.*;

public class StringCalculator {

	public static void main(String[] args) {
		String text = StdIn.readString();
		StdOut.println(add(text));
	}
	public static int add(String numbers)
	{
		if (numbers.equals("")) {
			return 0;
		}
		else if (numbers.contains(",") || numbers.contains("/n")) {
			String[] splitnumbers = split(numbers);
			int sum = 0;
			
			for (int i = 0; i < splitnumbers.length; i++) {
				sum += Integer.parseInt(splitnumbers[i]);
			}
			
			return sum;
		}
		else {
			return Integer.parseInt(numbers);
		}
	}
	private static String[] split(String numbers) {
		String[] split = null;
		
			if (numbers.contains(",") && numbers.contains("/n")) split = numbers.split(("/n|\\,"));
			else if (numbers.contains(",") && !(numbers.contains("/n"))) split = numbers.split(",");
			else if (numbers.contains("/n") && !(numbers.contains(","))) split = numbers.split("/n");
		
		return split;
	}

}
