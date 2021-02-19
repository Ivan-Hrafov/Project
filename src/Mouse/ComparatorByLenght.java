package Mouse;


import java.util.Arrays;
import java.util.Comparator;

public class ComparatorByLenght implements Comparator<String> {
    public static void main(String[] args) {

        String[] array = {"баркас", "ёлка", "баржа", "арбузы", "тыква"};

        Arrays.sort(array, new ComparatorByLenght());

        System.out.println(Arrays.toString(array));

    }
    @Override
    public int compare(String o1, String o2) {
        if (o1 == null) {
            return 1;
        }

        if (o2 == null) {
            return -1;
        }
        return o1.length() - o2.length();
    }
}


