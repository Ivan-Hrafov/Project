package PracticeOnly;

public class ColorPoint extends Point {
    private  int color;

    public ColorPoint(double x, double y, int color) {
        super(x, y);
        this.color = color;
    }

    public ColorPoint() {
        color = 4;
    }

    public void print() {
        super.print();
        System.out.print(" and color " + color);
    }
}
