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
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    ////////////////////////////////////////////// VARIABLES ///////////////////////////////////////////////////////
//        int a = 123;
//        float b = 3.14f; // floats for storing numbers with decimals. must follow number with f.
//        boolean c = true;
//        long x = 1230000200000000222L; // for very long numbers. must follow number with L
//        char symbol = '@';
//        String name = "Jared";
//
//        System.out.println(name);

    //////////////////////////////////////////////// SWAPPING VARIABLES //////////////////////////////////////////////
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

    //////////////////////////////////////////////// USER INPUT ///////////////////////////////////////////////////////
//        Scanner scanner = new Scanner(System.in); //imported above class
//
//        System.out.println("What is your name? ");
//        String name = scanner.nextLine();
//        System.out.println("How old are you? ");
//        int age = scanner.nextInt();
//        scanner.nextLine(); //clears our scanner
//        System.out.println("What is your favorite food? ");
//        String food = scanner.nextLine();
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old");
//        System.out.println("You like " + food);

    ////////////////////////////////////////////// EXPRESSIONS ////////////////////////////////////////////////////////
//        // expression = operands and operators
//        // operands = values, variables, numbers, quantity
//        // operators = + - * / %
//
//        double friends = 10;
//
//        friends = (double) friends / 3;
//
//        System.out.println(friends);

    /////////////////////////////// GUI(GRAPHICAL USER INTERFACE) APPLICATION /////////////////////////////////////////
//        String name = JOptionPane.showInputDialog("Enter your name"); //JOptionPane imported above class
//        JOptionPane.showMessageDialog(null, "Hello " + name);
//
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        JOptionPane.showMessageDialog(null, "You are " + age + " years old");
//
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

    //////////////////////////////////////////////////// MATH CLASS ///////////////////////////////////////////////////
//        double x = 3.14;
//        double y = -10;
//        double z = 5;
//
//        double max = Math.max(x, y); // finds max number btwn the variables, min() finds min number
//        double absolute = Math.abs(y); // finds absolute value(number without negative sign)
//        double squared = Math.sqrt(z); // finds square root
//        double round = Math.round(x); // rounds number
//        double ceiling = Math.ceil(x); // always rounds up
//        double floor = Math.floor(x); // always rounds down
//
//        System.out.println(floor);

    //////////////////////////////////// FUNCTION TO FIND HYPOTENUSE OF TRIANGLE //////////////////////////////////////
//        double x;
//        double y;
//        double z;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter side x: ");
//        x = scanner.nextDouble();
//        System.out.println("Enter side y: ");
//        y = scanner.nextDouble();
//
//        z = Math.sqrt((x * x) + (y * y));
//
//        System.out.println("The hypotenuse is: " + z);

    /////////////////////////////////////////////// RANDOM NUMBERS ////////////////////////////////////////////////////
//        Random random = new Random(); // Random imported above class. Not true random numbers, they are pseudo random numbers(close enough)
//
//        int integerRandom = random.nextInt(6) + 1; // gives us random number btwn 1-6. added "+ 1" because index starts at 0
//        double doubleRandom = random.nextDouble(); // gives us random value between 0-1
//        boolean booleanRandom = random.nextBoolean();
//
//        System.out.println(integerRandom);

    ////////////////////////////////////////////// IF STATEMENTS //////////////////////////////////////////////////////
//        int age = 12;
//
//        if(age >= 75){
//            System.out.println("You old!");
//        } else if(age >= 18) {
//            System.out.println("You are an adult!");
//        } else if(age >= 13) {
//            System.out.println("You are a teenager!");
//        } else {
//            System.out.println("You are a child!");
//        }

    /////////////////////////////////////////////// SWITCHES //////////////////////////////////////////////////////////
        // switch = statement that allows a variable to be tested for equality against a list of values. better than a long string of if statements

//        String day = "pizza";
//
//        switch(day) {
//            case "Sunday": System.out.println("It is Sunday!");
//            break;
//            case "Monday": System.out.println("It is Monday!");
//            break;
//            case "Tuesday": System.out.println("It is Tuesday!");
//            break;
//            case "Wednesday": System.out.println("It is Wednesday!");
//            break;
//            case "Thursday": System.out.println("It is Thursday!");
//            break;
//            case "Friday": System.out.println("It is Friday!");
//            break;
//            case "Saturday": System.out.println("It is Saturday!");
//            break;
//            default: System.out.println("That is not a day!");
//        }

    /////////////////////////////////// LOGICAL OPERATORS /////////////////////////////////////////////////////////////
        // logical operators = used to connect two or more expressions
        // && = (AND) both conditions must be true
        // || = (OR) either condition must be true
        // ! = (NOT) reverses boolean value of condition

//        int temp = 25;
//
//        if(temp > 30) {
//            System.out.println("It is hot outside");
//        } else if(temp >= 20 && temp <= 30) {
//            System.out.println("It is warm outside");
//        } else {
//            System.out.println("It is cold outside");
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("You are playing a game! Press q or Q to quit");
//        String response = scanner.next();
//
//        if(response.equals("q") || response.equals("Q")) {
//            System.out.println("You quit the game");
//        } else {
//            System.out.println("You are still playing the game");
//        }

    /////////////////////////////////// WHILE LOOP ////////////////////////////////////////////////////////////////////
        // while loop = executes a block of code as long as it's condition remains true



    }
}
