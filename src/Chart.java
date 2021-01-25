import java.util.Scanner;

public class Chart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        String[] words = name.trim().split(" ");
        return words.length == 3;
    }

    private static String formatName(String name) { //объявление метода, на вход приходит строка, метод возвращает строку
        String[] words = name.trim().split(" ");//создаем массив строк, в каждую ячейку массива
//записываем отдельное слово( строку name, методом trim()удаляем пробелы в начале и в конце, а метод split разделяет пробелами)
        sortByLength(words);//вызываем метод sortByLength, на вход подаем ему массив words
        String result = ""; //создаем пустую строку(будет нужна далее)
        for (int i = 0; i < words.length; i++) {//запускаем цикл for чтобы пройтись по массиву words(начиная с нулевого символа до последнего)
            String str = words[i];//в переменную str записываем текущий элемент массива
            char firstChar = str.charAt(0);//создаем символьную переменную firstChar в нее, с помощью
//метода charAt(0), записываем нулевой символ строки str
            if (!Character.isUpperCase(firstChar)) { //проверяем,не находится ли firstChar в верхнем регистре(обратите внимание, что "!" - означает отрицание)
                result += Character.toUpperCase(firstChar) + str.substring(1) + " ";//если условие истина(т.е.firstChar НЕ находится
                // в верхнем регистре ), то в result записываем сначала это переменную,
                // но уже в верхнем регистре(с помощью метода Character.toUpperCase(firstChar)),
                // и конкатенируем с остальной частью строки(str.substring(1) - конкатенируем именно с 1-го символа,
                // т.к. нулевой уже записан )
                result += Character.toUpperCase(firstChar) + str.substring(1) + " ";
            } else {
                result += str + "";//если ложь, то просто перезаписываем строку str
            }
        }
        return result;//возвращаем строку result
    }

    private static void sortByLength(String[] words) {//создаем метод  sortByLength, на вход подаем массив строк, этот метод ничего не возвращает
        for (int i = 0; i < words.length - 1; i++) {//запускаем внешний цикл, который обойдет массив words с нулевого элемента, до предппоследнего
            for (int j = 0; j < words.length - 1; j++) {//запускаем внутренний цикл, который обойдет массив words с нулевого элемента,
                // до предппоследнего, обратите внимание, что на один шаг внешнего цикла, внутренний отработает полностью
                if (words[j].length() > words[j + 1].length()) {//если длина текущего элемента массива больше длины последующего элемента массива
                    String tmp = words[j];//то создаем "резервную" переменную tmp, и запишем в нее текущий элемент
                    words[j] = words[j + 1];//на место текущего элемента запишем значение последующего элемента
                    words[j + 1] = tmp;//на место последующего запишем значение текущего, которые мы сохраняли в резервной переменной.
                    // Как Вы видите, происходит сортировка.
                }
            }
        }
    }
}