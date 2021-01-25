package Cat;

public class Cat {
    //Поля класса
    double weight;
    String name;
    int age;
    String color;

    //Конструктор по умолчанию
    public Cat() {
        //вызов другого конструктора
        this(3000, "Barsik", 1, "Grey");
    }

    //Конструктор, принимающий параметры
    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
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
}
