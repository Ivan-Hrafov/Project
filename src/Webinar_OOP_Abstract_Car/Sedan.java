package Webinar_OOP_Abstract_Car;

public class Sedan extends Car {
    public Sedan(String brand, int horsePower,
                 boolean isAwd, float acceleration) {
        super(brand, horsePower, isAwd, acceleration); }

//    @Override
    void start() {
        System.out.println("Ridding Sedan");
    }
}
