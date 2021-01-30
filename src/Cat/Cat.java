package Cat;

public class Cat {
    //Поля класса
    private double weight;
    private String name;
    private int age;
    private String color;
    private static int catCount;

    //Конструктор по умолчанию
    public Cat() {
        //вызов другого конструктора
        this(3000, "Barsik", 1, "Grey");
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > this.age)
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Конструктор, принимающий параметры
    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
        catCount++;
    }

        //Методы класса
    void meow() {
        System.out.println("Meow");
    }

    void pee() {
        weight -= 20;
    }

    void eat() {
        //К *своему* весу прибавим 50
        this.weight += 50;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
