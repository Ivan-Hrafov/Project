package ExtendsCat;

public class Cat extends Animal {

    private double weight;

    public Cat() {
        super(false, "milk and meat");
    }

    public void sound() {
        System.out.println("Meow");
    }

    public void eat() {
        weight += 50;
        System.out.println("soska" + weight);
    }

}
