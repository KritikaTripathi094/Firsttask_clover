/*  import java.util.Scanner;

public class Skipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        System.out.print("Enter the number to skip multiples of: ");
        int skip = sc.nextInt();

        for (int i = 1; i <= limit; i++) {
            if (i % skip == 0)
                continue;
            System.out.println(i);
        }

        sc.close();
    }
}  */
  
/*  public class Fizz {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}  */
/*import java.util.Scanner;
public class EvenGreater{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 integers:");

        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0 && num > 20) {
                System.out.println(num);
            }
        }

        sc.close();
    }
} */
/*  public class SumandProduct {
    public static void main(String[] args) {
        int sumEven = 0;
        int productOdd = 1;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sumEven += i;  
            } else {
                productOdd *= i; 
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Product of odd numbers: " + productOdd);
    }
} */
/*  public class CustomLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i == 15) {
                System.out.println("skip");
                continue;
            }

            if (i % 4 == 0) {
                System.out.println(i * 2); 
            } else {
                System.out.println(i);
            }
        }

        System.out.println("done");
    }
} */
/*  import java.util.Scanner;

public class ATMPinVerification {
    public static void main(String[] args) {
        final int CORRECT_PIN = 1234;   
        int attempts = 0;               
        Scanner sc = new Scanner(System.in);

        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == CORRECT_PIN) {
                System.out.println("Access Granted");
                sc.close();
                return; 
            } else {
                attempts++;
                if (attempts < 3) {
                    System.out.println("Incorrect PIN, try again");
                }
            }
        }

        System.out.println("Account locked");
        sc.close();
    }
} */

