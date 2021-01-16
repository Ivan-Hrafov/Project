package ExtendsZoo;

import java.util.Arrays;

public class Zoo {
    Object[] objects;

    @Override
    public String toString() {
        return "Zoo: " + Arrays.toString(objects);
    }

    public Zoo() {
        objects = new Object[3]; // в этой строке мы еще не создаем животных
        // наполняем массив конкретными животными
        objects[0] = new Dog();
        objects[1] = new Cat();
        objects[2] = new Reptile();
    }

    public void print() {
        // Используем цикл!
        // Каждое животное выводится по-своему!
        for (Object a : objects) {
            System.out.println(a);
        }
    }

    public void sound() {
        for (Object a : objects) {
            if (a instanceof Soundable)
                ((Soundable)a).sound();
        }
    }

    public void change(Object a, int i) {
        if (i > 0 && i < objects.length)
            objects[i] = a;
    }
}
