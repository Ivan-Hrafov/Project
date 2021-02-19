package ExtendsZoo;

public class Cat extends Animal implements Soundable {

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    public void print() {
        System.out.println(this);
    }


    @Override
    public String toString() {
        return "Cats can move";
    }
}
