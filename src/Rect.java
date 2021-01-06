public class Rect {

    private int s;
    int w, h;
    int rect;

    Rect(int w, int h) {
        this.w = w;
        this.h = h;
        s = w * h;
        rect = w * h;

    }

    int getS() {
        return s;
    }

    public void setW(int w) {
        this.w = w;
    }

    int getW() {
        return w;
    }

    int getH() {
        return h;
    }
}