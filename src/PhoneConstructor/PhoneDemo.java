package PhoneConstructor;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+380954051656", "Apple", 7.8);
        Phone phone2 = new Phone("+380955898785", "Samsung");
        Phone phone3 = new Phone();

       /* phone2.weight = 10;*/

        System.out.println(phone1.getNumber());
        System.out.println(phone1.model);
        System.out.println(phone1.weight);
        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.model);
        System.out.println(phone2.weight);
        System.out.println();

        System.out.println(phone3.getNumber());
        System.out.println(phone3.model);
        System.out.println(phone3.weight);
        System.out.println();

        phone1.receiveCall("Mother");
        phone1.receiveCall("Father");
    }
}
