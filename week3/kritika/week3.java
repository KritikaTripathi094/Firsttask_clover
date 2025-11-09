/* class Main {
    public static void main(String[] args) {
        System.out.println("num betn 1 and 50 divisible by 3 or 5 : ");
        
        for ( int i = 1; i <=50; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && ! (i % 3 == 0 && i % 5 == 0 )){
                System.out.println(i);
            }
        }
    }
}
    */



/*import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("All the numbers from 1 to your input (except those divisible by 4):");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        
        for (int i = 1; i <= number; i++) {
            if (i % 4 == 0) {
                continue;
            }
            System.out.println(i);
        }

        sc.close();
    }
}
 */



 /*public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("FizzBuzz from 1 to 30:");

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
}
 */




/*import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.println("Enter 10 integers: ");

        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

                        if (num % 2 == 0 && num > 20) {
                System.out.println(num + " is even and greater than 20.");
            }
        }

        sc.close();
    }
}
     */


/*public class main {
    public static void main(String [] args) {
        for ( int i = 1; i <=30; i++ ) {
            if (i == 15) {
                System.out.println ("skip");
            } 
            else if (i % 4 == 0) {
                System.out.println(i*2);
            }
            else {
                System.out.println(i);
            }
        }
        System.out.println("Done");
    }
} */




/*import java.util.Scanner;
class main {
    public static void main(String[] args) {
        int pass = 1234;
        Scanner sc = new Scanner (System.in);
       
        for (int i=0; i<=5; i++){
            System.out.println("Enter the password:");
            int password = sc.nextInt();
            
            
            if ( password == pass ) {
                System.out.println("Access Granted") ;
                break;
                
            }
            
                
            else{ 
                System.out.println("try again");
            }
            if(!accessGranted) {
               System.out.println("Account locked")}
            
            }
        }
} */



/*class Main {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddProduct = 1;

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {      
                evenSum += i;
            } else {              
                oddProduct *= i;
            }
        }

        System.out.println("Sum of even numbers between 1 and 10: " + evenSum);
        System.out.println("Product of odd numbers between 1 and 10: " + oddProduct);
    }
}
 */

 public class week3 {
    public static void main(String[] args) {
        int days = 4;
        switch (days) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;

            
        }
}