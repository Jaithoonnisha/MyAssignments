package week1.day2;

public class SwitchStatements {

	public static void main(String[] args) {
		/*int age =18
	case 1-> 17 -> under age for voting
	case 2 -> 18 -> age for voting
	default -> No voting*/
		
		int age=18;
		switch (age) {
		case 18:
			System.out.println("Age for voting");
			break;
		case 17:
			System.out.println("Under age for voting");
			break;

		default:
			System.out.println("No voting");
			break;
		}
	}
}
