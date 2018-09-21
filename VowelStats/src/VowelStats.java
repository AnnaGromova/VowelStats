import java.util.Scanner;

public class VowelStats {

	public static void main(String[] args) {
		Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
		var stats = new SymbolsStats(vowels);
		var text = ReadLine();
		stats.calculate(text);
		stats.writeStats();
	}
	
	public static String ReadLine() {
		var scanner = new Scanner(System.in);
		var text = scanner.nextLine();
		scanner.close();
		return text;
	}
}

