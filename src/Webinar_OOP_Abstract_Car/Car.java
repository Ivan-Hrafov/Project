package Webinar_OOP_Abstract_Car;


import java.util.ArrayList;
import java.util.List;

public class Car extends Transport implements Rideable {
    public String brand;
    public boolean isAwd;
    public float acceleration;
    public Luggage luggage= new Luggage();
    public float currentSpeed;
    public Engine engine = new Engine(25);

    class Engine {
        public int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        public void increaseSpeed(){
            currentSpeed += 20;
        }

        public void decreaseSpeede() {
            currentSpeed -= 20;
        }
    }


    static class Luggage {
        List<Object> items;

        public Luggage() {
            items = new ArrayList<>();
        }
        public void addItem(Object item) {
            items.add(item);
        }

        public Object getItem(int id) {
            return items.get(id);
        }
    }

    public Car() {
        this("Mazda", 200, false, 10); }

    public Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        engine.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
        type = "Car";
    }

    public float countSpeed(float time) {
        return (100/acceleration) * time;
    }

//    abstract void start();

    void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", horsePower=" + engine.horsePower +
                ", isAwd=" + isAwd +
                ", acceleration=" + acceleration +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void ride() {
        System.out.println("Ridding " + brand);
    }
}
