import java.util.Scanner;

public class SecondAndMinutes {

	private static final String INVALID_VALUE_MESSAGE = "Invalid value";

	public static void main(String[] args) {

		int value = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("1. Calcolo secondi e minuti => ore");
		System.out.println("2. Calcolo secondi => ore");
		System.out.println("24. Ester egg");

		switch (value = in.nextInt()) {
		case 1:
			System.out.println("Inserisci i secondi e i minuti:");
			getDurationString(in.nextLong(), in.nextLong());
			break;
		case 2:
			System.out.println("Inserisci i secondi:");
			getDurationString(in.nextLong());
			break;
		case 24:
			System.out.println("Nankurunaisa.\n" + "Credo sia una delle parole più belle del mondo.\n"
					+ "E’ giapponese e significa “con il tempo si sistema tutto”.\n" + "(Anonimo)");
			break;
		default:
			System.out.println("Invalid value!");
			break;
		}

		in.close();

	}

	private static String getDurationString(long minutes, long seconds) {

		if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
			return INVALID_VALUE_MESSAGE;
		}

		long hours = minutes / 60;
		long remainingMinutes = minutes % 60;

		return hours + "h " + remainingMinutes + "m " + seconds + " s";
	}

	private static String getDurationString(long seconds) {

		if (seconds < 0) {
			return INVALID_VALUE_MESSAGE;
		}

		long minutes = seconds / 60;
		long remainingSeconds = seconds % 60;

		return getDurationString(minutes, remainingSeconds);
	}

}
