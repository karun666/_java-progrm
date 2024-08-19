import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {    
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter value = ");
            int number=scanner.nextInt();
                
                if (isPrime(number)) 
                {
                    System.out.println(number + " is a prime number.");
                } else {
                    
                    System.out.println(number + " is not a prime number.");
                }
        }
        }

        public static boolean isPrime(int number) {
            // Handle special cases
            if (number <= 1) {
                return false;
            }
            if (number == 2) {
                return true; // 2 is the only even prime number
            }
            if (number % 2 == 0) {
                return false; // Other even numbers are not prime
            }

            // Check for factors from 3 to sqrt(number)
          // for (int i = 3; i <= Math.sqrt(number); i += 2) {
                for (int i = 3; i <= number/2; i += 2) {
                if (number % i == 0) {
                    return false; // If divisible by any number other than 1 and itself
                }
            }

            return true;
        }
    }