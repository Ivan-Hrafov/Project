package ExtendsZoo;

public class Dog extends Animal implements Soundable {
    @Override
    public void sound() {
        System.out.println("Bark");
    }

    public void print() {
        System.out.println(this); }


    @Override
    public String toString() {
        return "Dog can move";
    }
}
