import java.util.Scanner;
public class HelloWorld {
    static void printMessage(int num1, int num2) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter oprator: +, -, *, or /");
        String userName = myObj.nextLine();  // Read user input
        if (userName.equals("+")) {
            System.out.println(num1 + num2);
        } else if (userName.equals("-")) {
            System.out.println(num1 - num2);
        } else if (userName.equals("*")) {
            System.out.println(num1 * num2);
        } else if (userName.equals("/")) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid operator");
        }


    }



    public static void main(String[] args) {

        printMessage(5, 10);
    }
}
