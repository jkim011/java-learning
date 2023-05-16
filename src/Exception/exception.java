//package Exception;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//public class exception {
//    public static void main(String[] args) {
//        // exception = an event that occurs during the execution of a program that, disrupts the normal flow of instructions
//
//        Scanner scanner = new Scanner(System.in);
//        try {   // use try{} to try the code if theres anything dangerous that can happen within
//            System.out.println("Enter a whole number to divide: ");
//            int x = scanner.nextInt();
//
//            System.out.println("Enter a whole number to divide by: ");
//            int y = scanner.nextInt();
//
//            int z = x / y;
//
//            System.out.println("Result: " + z);
//        }
//        catch(ArithmeticException e) {
//            System.out.println("You can't divide by zero!");
//        }
//        catch(InputMismatchException e) {
//            System.out.println("You must enter a number!");
//        }
//        catch(Exception e) {
//            System.out.println("Something went wrong");
//        }
//        finally {
//            scanner.close();
//        }
//    }
//}
