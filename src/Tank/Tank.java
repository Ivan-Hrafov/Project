package Tank;

public class Tank {
    private int x, y;
    private int dir;
    private int fuel;
    private int n;

    static final String MODEL = "T-34";
    static int ntanks;

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        n = ++ntanks;
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank() {
        this(0, 0, 100);
    }

    public void goForward(int i) {
        if (i < 0 && -i > -fuel)
            i = -fuel;
        else if (i > fuel)
            i = fuel;
        if (dir == 0) {
            x += i;
        } else if (dir == 1) {
            y += i;
        } else if (dir == 2) {
            x -= i;
        } else {
            y -= i;
            fuel -= Math.abs(i);
        }
    }

    public void turnRight() {
        dir++;
        if (dir == 4) {
            dir = 0;
        }
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) {
            dir = 3;
        }
    }

    public void printPosition() {
        System.out.println("The Tank is at " + MODEL + "-" + n + " " + x + "," + y + " now!");
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}