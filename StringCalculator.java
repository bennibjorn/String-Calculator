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
		else if (numbers.contains(",")) {
			String[] splitnumbers = split(numbers);
			int sum = 0;
			
			for (int i = 0; i < splitnumbers.length; i++) {
				sum += Integer.parseInt(splitnumbers[i]);
			}
			
			return sum;
		}
		return 1;
	}
	private static String[] split(String numbers) {
		return numbers.split(",");
	}

}
