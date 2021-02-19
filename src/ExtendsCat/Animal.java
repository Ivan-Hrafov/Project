package ExtendsCat;

public class Animal {

    private boolean vegeterian;
    private String eats;


    public Animal(boolean veg, String food) {
        this.vegeterian = veg;
        this.eats = food;
    }

    public Animal() { }

    public void sound() {
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public String getEats() {
        return eats;
    }
}
