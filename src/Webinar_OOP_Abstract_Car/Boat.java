package Webinar_OOP_Abstract_Car;

public class Boat implements Rideable, Swimmable {

    @Override
    public void ride() {
        this.swim();
    }

    /*@Override
    public void swim() {
        System.out.println("Swimming on the boat");
    }*/
}
