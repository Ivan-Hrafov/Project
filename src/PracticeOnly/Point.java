package PracticeOnly;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        x = 10.5;

    }

    public void print() {
        System.out.print("Point with coords " + x + ", " + y);
    }
}