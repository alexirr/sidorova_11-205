public class Program {
	public static void main (String arg[]) {
		System.out.println("________________________________");
		System.out.println("|   &   |   &   |   &   |   &  |");
		System.out.println("________________________________");
		System.out.println("|  true | false | true  | false|");
		System.out.println("________________________________");
		System.out.println("|  true | true  | false | false|");
		System.out.println("________________________________");
		System.out.println("| " + (true&true) + " | " + (false&true) + " | " + (true&false) + " | "  + (false&false) + " |");
		System.out.println("--------------------------------");

		System.out.println("________________________________");
		System.out.println("|   |   |   |  |   |   |   | |");
		System.out.println("________________________________");
		System.out.println("|  true | false | true  | false|");
		System.out.println("________________________________");
		System.out.println("|  true | true  | false | false|");
		System.out.println("________________________________");
		System.out.println("| " + (true|true) + " | " + (false|true) + " | " + (true|false) + " | "  + (false|false) + " |");
		System.out.println("--------------------------------");

		System.out.println("________________________________");
		System.out.println("|   ^   |   ^   |   ^   |   ^  |");
		System.out.println("________________________________");
		System.out.println("|  true | false | true  | false|");
		System.out.println("________________________________");
		System.out.println("|  true | true  | false | false|");
		System.out.println("________________________________");
		System.out.println("| " + (true^true) + " | " + (false^true) + " | " + (true^false) + " | "  + (false^false) + " |");
		System.out.println("--------------------------------");

		System.out.println("________________________________");
		System.out.println("|   !   |   !   |");
		System.out.println("________________________________");
		System.out.println("|  true | false |");
		System.out.println("________________________________");
		System.out.println("| " + (!(true)) + " | " + (!(false)) + " |");
		System.out.println("--------------------------------");
	}


}
	
