package ExtendsZoo;

public class PopcornStall implements Soundable {
    public void print() {
        System.out.println(this);
    }

    public void sound() {
        System.out.println("Hey! The best popcornis here!");
    }

    @Override
    public String toString() {
        return "It's PopcornStall";
    }
}