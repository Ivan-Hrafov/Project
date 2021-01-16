package ExtendsZoo;

public class Reptile extends Animal {
    public void print() {
        System.out.println("I am a Reptile");
    }

    @Override
    public String toString() {
        return "I am a Reptile";
    }
}
