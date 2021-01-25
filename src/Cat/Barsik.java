package Cat;

class Barsik {
    public static void main(String[] args) {
        Cat barsik = new Cat();
        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
        barsik.meow();
    }

}