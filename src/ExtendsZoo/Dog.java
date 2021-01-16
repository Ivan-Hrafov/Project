package ExtendsZoo;

public class Dog extends Animal implements Soundable {
    public void print() {
        System.out.println(this);
    }

    @Override
    public void sound() {
        System.out.println("Bark");
    }

    @Override
    public String toString() {
        return "I am a Dog";
    }
}
