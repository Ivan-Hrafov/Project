package PhoneConstructor;

public class Phone {
    String number;
    String model;
    double weight;

    Phone(String n, String m, double w) {
        number = n;
        model = m;
        weight = w;
    }

    public Phone(String n, String m) {
        number = n;
        model = m;
    }

    public Phone() {
    }

    void receiveCall(String name) {
        System.out.println("Calling" + name);
    }

    String getNumber() {
        return number;
    }
}
