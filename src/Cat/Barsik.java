package Cat;

class Barsik {
    public static void main(String[] args) {
        Cat barsik = new Cat();
        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
        barsik.meow();
        bigCat.setName("Pushok");
        System.out.println("The name of big cat " + bigCat.getName());
        System.out.println("The name of small cat " + smallCat.getName());
    }

}