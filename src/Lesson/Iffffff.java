package Lesson;

public class Iffffff {
    public static void main(String[] args) {
        if ("1".equals(args[0])) {
            System.out.println("Monday");
        } else if ("2".equals(args[0])) {
            System.out.println("Tuesday");
        } else if ("3".equals(args[0])) {
            System.out.println("Wednesday");
        } else if ("4".equals(args[0])) {
            System.out.println("Thursday");
        } else if ("5".equals(args[0])) {
            System.out.println("Friday");
        } else if ("6".equals(args[0]) || "7".equals(args[0])) {
            System.out.println("Weekend");
        } else {
            System.out.println("error");
        }
    }
}
        /*int numb = Integer.parseInt(args[0]);
        if (numb % 2 != 0) {
            System.out.println(numb); } } }
*/
/*
import java.util.Scanner;

class Iffffff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            compareNumber(num);
        } else {
            System.out.println("Значение не верно!");
        }
    }

    private static void compareNumber(int num) {
        if (num > 0 && num < 10) {
            System.out.println("++++");
        } else {
            System.out.println("-----");
        }
    }
}
*/
