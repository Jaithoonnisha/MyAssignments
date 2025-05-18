package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int number=6;
		boolean isPrime = true;
		
		if (number == 2) {
            System.out.println("Prime number");
        } 
        else {
            

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not a prime number");
            }
        } 
        
    }
}