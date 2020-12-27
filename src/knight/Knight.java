package knight;

public class Knight {

    private String name = "Sir Thanks-A-Lot";
    private String weapon = "Long Sword";
    private Boolean isGoingToSavePrincess = true;

    public static void main(String[] args) {  //Теперь мы сможем из метода main вызвать этот метод на созданном «рыцаре»

        Knight knight = new Knight();  //Явили миру рыцаря
        knight.goAndSaveThePrincess();  //Отправляем его за принцессой

    }

    public void goAndSaveThePrincess() {//Создадим у нашего «рыцаря» метод, для того чтобы пойти и спасти принцессу
        sharpenBlade();
        getFood();
        assembleTeam();
        sitHorse();
        System.out.println("Да иду уже...");
    }

    private void sharpenBlade() {
        System.out.println("Точим мечь");
    }

    private void getFood() {
        System.out.println("Собираем консервы");
    }

    private void assembleTeam() {
        System.out.println("Будим оруженосца");
    }

    private void sitHorse() {
        System.out.println("Седлаем коня");
    }
}
