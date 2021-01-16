package ExtendsCat;

import java.awt.*;

public class Cat extends Animal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.getEats();
    }

    public Cat() {
        //хищник, питается мясом и молоком
        super(false, "milk and meat");
    }

    public void sound() {
        System.out.println("Meow");
    }
}