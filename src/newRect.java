public class newRect {

    public static void main(String[] args) {
        Rect rect = new Rect(20, 30);
        rect.w = 1;

        System.out.println(rect.getW() * rect.getH() == rect.getS());
    }
}
