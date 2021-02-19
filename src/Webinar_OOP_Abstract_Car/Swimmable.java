package Webinar_OOP_Abstract_Car;

public interface Swimmable {
    long MAX_DIST = 1999;
    default void swim() {
        System.out.println("Swimming till " + MAX_DIST);
    }
}

