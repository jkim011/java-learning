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

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.*;

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
        // switch = statement that allows a variable to be tested for equality against a list of values. better than a
            // long string of if statements

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
//        // while loop = executes a block of code as long as it's condition remains true. could theoretically go on forever
//
//        Scanner scanner = new Scanner(System.in);
//        String name = "";
//
////        while(name.isBlank()) {  // while loop
////            System.out.print("Enter your name: ");
////            name = scanner.nextLine();
////        }
//
//        do {  // do loop variation. always performs block of code at least once, and THEN check the while condition after
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        } while(name.isBlank());
//
//        System.out.println("Hello " + name);

    ///////////////////////////// FOR LOOPS ////////////////////////////////////////////////////////////////////////////
//        // for loop = executes a block of code a limited amount of times
//
//        for(int i = 0; i <= 10; i++) { // will iterate 11 times because index counts from 0
//            System.out.println(i);     // counts up
//        }
//
//        for(int i = 10; i >= 0; i--) { // counts down
//            System.out.println(i);
//        }
//
//        for(int i = 10; i >= 0; i-=2) { // counts down by 2s
//            System.out.println(i);
//        }
//
//        System.out.println("Happy new year!");

    /////////////////////////////////////// NESTED LOOPS //////////////////////////////////////////////////////////////
//        // nested loops = a loop inside of a loop. can be any combination of while loops, for loops, do loops
//
//        Scanner scanner = new Scanner(System.in);
//
//        int rows;
//        int columns;
//        String symbol = "";
//
//        System.out.println("Enter # of rows: ");
//        rows = scanner.nextInt();
//        System.out.println("Enter # of columns: ");
//        columns = scanner.nextInt();
//        System.out.println("Enter symbol to use: ");
//        symbol = scanner.next();
//
//        for(int i=1; i<=rows; i++) {
//            System.out.println();
//            for(int j=1; j<=columns; j++) {
//                System.out.print(symbol); // must be print not println so it breaks out of the loop
//            }
//        }

    //////////////////////////////////////////// ARRAYS ///////////////////////////////////////////////////////////////
//        String[] cars = {"Camaro", "Corvette", "Tesla"};
//        cars[0] = "Mustang";
//        System.out.println(cars[0]);
//        System.out.println(cars[1]);
//        System.out.println(cars[2]);
//                                     //                   ^
//        System.out.println();        // Two ways to do it |  |
//                                     //                      v
//        String[] languages = new String[3];
//        languages[0] = "JavaScript";
//        languages[1] = "HTML";
//        languages[2] = "CSS";
//        System.out.println(languages[0]);
//        System.out.println(languages[1]);
//        System.out.println(languages[2]);
//
//        System.out.println();
//
//        for(int i=0; i<cars.length; i++) { // using for loop to print array
//            System.out.println(cars[i]);
//        }

    ////////////////////////////////////////// 2D ARRAYS ///////////////////////////////////////////////////////////////
//        // 2D array = an array of arrays
//
//        String [][] cars = new String[3][3];
//        cars[0][0] = "Camaro";
//        cars[0][1] = "Mustang";
//        cars[0][2] = "Charger";
//        cars[1][0] = "GTR";
//        cars[1][1] = "WRX";
//        cars[1][2] = "Supra";
//        cars[2][0] = "Lambo";
//        cars[2][1] = "Ferrari";
//        cars[2][2] = "Pagani";
//                                     //                             ^
//        System.out.println();        // Two ways to write 2D arrays |  |
//                                     //                                v
//        String [][] foods = {
//                {"Galbi", "Bulgogi", "Kimchi"},
//                {"Taco", "Fajita", "Burrito"},
//                {"Burger", "Hotdog", "Pizza"}
//        };
//
//        for(int i=0; i<cars.length; i++) {  // using nested loop to print 2D array of cars
//            System.out.println();
//            for(int j=0; j<cars[i].length; j++) {
//                System.out.print(cars[i][j] + " ");
//            }
//        }

    ///////////////////////////////////// STRING METHODS //////////////////////////////////////////////////////////////
//        String name = "   Jared";
//
//        //boolean result = name.equals("Jared");
//        //int result = name.length();
//        //char result = name.charAt(1);
//        //int result = name.indexOf("J");
//        //boolean result = name.isEmpty();
//        //String result = name.toUpperCase();
//        //String result = name.toLowerCase();
//        //String result = name.trim();
//        //String result = name.replace("a", "e");
//
//        System.out.println(result);

    /////////////////////////////////////// WRAPPER CLASSES ///////////////////////////////////////////////////////////
//        // wrapper class = provides a way to use primitive data types as reference data types.
//        //                 reference data types contain useful methods
//        //                 can be used with collections (ex: ArrayList)
//        //
//        // Primitive          Wrapper        *primitive values are a lot faster
//        //-----------        ----------
//        // boolean            Boolean
//        // char               Character
//        // int                Integer
//        // double             Double
//        //
//        // autoboxing = automatic conversion that Java compiler makes btwn primitive types and their corresponding
//        //              object wrapper classes
//        // unboxing = reverse of autoboxing. Automatic conversion of wrapper class to primitive
//
//        Boolean a = true;
//        Character b = '@';
//        Integer c = 123;
//        Double d = 3.14;
//        String e = "Jared";
//
//        if(a==true) {
//            System.out.println("This is true");
//        }

    ///////////////////////////////////////// ARRAYLIST ///////////////////////////////////////////////////////////////
//        // ArrayList = a resizeable array. Elements can be added and removed after compilation phase. stores only reference data types
//
//        ArrayList<String> food = new ArrayList<String>();  // imported java.util.ArrayList
//
//        food.add("pizza");
//        food.add("burger");
//        food.add("hotdog");
//
//        food.set(0, "sushi"); // sets new value in provided index
//        food.remove(2); // removes provided index
//        food.clear(); // clears entire array list
//
//        for(int i=0; i<food.size(); i++) {
//            System.out.println(food.get(i));
//        }

    ////////////////////////////////////////// 2D ARRAYLIST ////////////////////////////////////////////////////////////
//        // 2D ArrayList = a dynamic set of lists. can change the size of these lists during runtime
//        // imported java.util.*
//
//        ArrayList<ArrayList<String>> groceryList = new ArrayList(); // 2D ArrayList containing list of all the other arrays
//
//        ArrayList<String> bakeryList = new ArrayList();
//        bakeryList.add("pasta");
//        bakeryList.add("garlic bread");
//        bakeryList.add("donuts");
//
//        ArrayList<String> produceList = new ArrayList();
//        produceList.add("tomato");
//        produceList.add("onion");
//        produceList.add("peppers");
//
//        ArrayList<String> drinksList = new ArrayList();
//        drinksList.add("soda");
//        drinksList.add("coffee");
//
//        groceryList.add(bakeryList); // Adding the other arrays into our groceryList 2D Array
//        groceryList.add(produceList); //
//        groceryList.add(drinksList); //
//
//        System.out.println(groceryList);
//        System.out.println(groceryList.get(0));
//        System.out.println(groceryList.get(0).get(2));

    ///////////////////////////////////// FOR EACH LOOP ///////////////////////////////////////////////////////////////
//        // for-each = traversing technique to iterate thru the elements in an array/collection
//        //            it's less steps and more readable, but it's less flexible
//
//        ArrayList<String> animals = new ArrayList<String>();
//
//        animals.add("cat");
//        animals.add("dog");
//        animals.add("rat");
//        animals.add("bird");
//
//        for(String i : animals) {
//            System.out.println(i);
//        }

    ///////////////////////////////////////////// METHODS /////////////////////////////////////////////////////////////
//        // method = a block of code that is executed wheever it is called upon
//        //          kinda like javascript functions
//        //          must be called outside main class
//
//        String name = "Jared";
//        int age = 21;
//        hello(name, age);
//
//        int x = 3;
//        int y = 4;
//        System.out.println(add(x, y));
    }
//    static void hello(String name, int age) { // for parameters u dont have to keep names of values consistent. could change name to anything
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age);
//    }
//
//    static int add(int x, int y) {
//        int z = x + y;
//        return z;
//    }
}
