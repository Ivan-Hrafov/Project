package ExtendsZoo;

public class Reptile extends Animal {


    public void print() {
        System.out.println(this);
    }


    public void change() {
        System.out.println("I am Reptile");
    }

    @Override
    public String toString() {
        return "Reptile can move";
    }
}
