package Tank;

class Tank {
    int x;

    public void goForward(int i) {
        x += i;
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x + " now");
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}