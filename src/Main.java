/* Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
   then press Enter. You can now see whitespace characters in your code.
 */
/* Press Alt+Enter with your caret at the highlighted text to
   see how IntelliJ IDEA suggests fixing it.
 */
// Press Shift+F10 or click the green arrow button in the gutter to run the code.
/* Press Shift+F9 to start debugging your code. We have set one breakpoint
   for you, but you can always add more by pressing Ctrl+F8.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //////////////////////////////////////// VARIABLES ///////////////////////////////////////////////////
//        int a = 123;
//        float b = 3.14f; // floats for storing numbers with decimals. must follow number with f.
//        boolean c = true;
//        long x = 1230000200000000222L; // for very long numbers. must follow number with L
//        char symbol = '@';
//        String name = "Jared";
//
//        System.out.println(name);

    ///////////////////////////////////////// SWAPPING VARIABLES //////////////////////////////////////////
//        String x = "water";
//        String y = "Kool-Aid";
//        String temp;
//
//        temp = x;
//        x = y;
//        y = temp;
//
//        System.out.println("x: " + x);
//        System.out.println("y: " + y);

    ////////////////////////////////////////////// USER INPUT ////////////////////////////////////////////////////
        Scanner scanner = new Scanner(System.in); //imported above class

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine(); //clears our scanner
        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);

    ///////////////////////////////////////// EXPRESSIONS //////////////////////////////////////////////////


    }
}
