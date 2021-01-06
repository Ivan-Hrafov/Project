package Cat;

public class Cat {

    //Поля класса
    private double weight;
    private String name;
    private int age;
    private String color;
    private static int catCount;

    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
        catCount++;
    }

    public Cat() {
        this(3000, "Barsik", 1, "Grey");
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
        if (age > this.age);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    //Методы класса
    public void meow() {
        System.out.println("Meow");
    }

    private void pee() {
        weight -= 20;
    }

    public void eat() {
        weight += 50;
        if (50 / weight > .01)
            pee();
    }
}
