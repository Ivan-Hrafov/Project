import java.util.Scanner;

public class Kalculator {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first num: ");
        int operand1 = scanner.nextInt();//считывает число
            System.out.println("Enter arithmetic operation: ");
        char operation = scanner.next().charAt(0);
            System.out.println("Enter second num: ");
        int operand2 = scanner.nextInt();

        switch (operation) {
            case '+':
                System.out.println("Result is " + operand1 + operand2);
                break;
            case '-':
                System.out.println(operand1 - operand2);
                break;
            case '*':
                System.out.println(operand1 * operand2);
                break;
            case '/':
                System.out.println(operand1 / operand2);
                break;
        }
    }
}