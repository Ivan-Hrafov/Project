package cookie;

public class Cookie {

    public static void main(String[] args) {
        noReturn();
        System.out.println(sum(1, 2, "str"));// 1, 2, "str" - аргументы, переданные в метод
    }

    private static void noReturn() {
        System.out.println("No return");
    }

    private static int sum(int a, int b, String str) { /* int a, int b, String - параметры, которые нужно еще передать*/
        return a + b;
    }
}
