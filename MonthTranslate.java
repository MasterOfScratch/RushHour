import java.util.Scanner;

public class MonthTranslate {

	public static void main(String[] args) {
		System.out.println("To see the first three letters of a month");
		System.out.print("enter a month number (1-12)");
		Scanner keyboard = new Scanner(System.in);
		int monthNumber = keyboard.nextInt();
		final String MONTH_TABLE = "JanFebMarAprMayJun" + "JulAugSepOctNovDec";
		int start = (monthNumber - 1) *3;
		int stop = start + 3;
		String monthAbbrev = MONTH_TABLE.substring(start, stop);
		System.out.println("\nMonth #" + monthNumber + " begins with '" + monthAbbrev + "'.");
	}
}
