package Lesson3;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        doTask1();

        doTask2(words);

    }


    private static void doTask1() {
        while (true) {
            int randomNumber = 0 + (int) (Math.random() * 9);

            for (int i = 0; i < 3; i++) {
                System.out.println("Введите число");
                Scanner scanner = new Scanner(System.in);
                int scannerNum = scanner.nextInt();

                if (randomNumber < scannerNum) {
                    System.out.println("Число больше загаданного");
                } else if (randomNumber > scannerNum) {
                    System.out.println("Число меньше загаданного");
                } else {
                    System.out.println("Вы выиграли");
                    break;
                }
            }

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            Scanner scanner = new Scanner(System.in);
            int scannerSelection = scanner.nextInt();

            if (scannerSelection == 0) {
                break;
            } else if (scannerSelection == 1) {
                continue;
            } else {
                System.out.println("Вы ввели не корректные данные");
                break;
            }
        }
    }

    private static void doTask2(String[] words) {

        int numRandom = (int) (Math.random() * words.length);

        char[] charStrRandom = words[numRandom].toCharArray();

        char[] charGtid = new char[15];
        for (int i = 0; i < charGtid.length; i++) {
            charGtid[i] = '#';
        }

        System.out.println("Угадайте загаданное компьютером слово!");
        Scanner scannerChar = new Scanner(System.in);
        while (true) {
            System.out.println("Введите слово. (END - выход)");

            String word = scannerChar.nextLine();
            if (word.equals("END")) {
                break;
            }
            if (word.equals(words[numRandom])) {
                System.out.println("Вы правильно угадали слово: " + words[numRandom]);
                break;
            } else {
                System.out.println("Вы не угадали слово!");
                char[] charWord = word.toCharArray();

                for (int i = 0; i < charStrRandom.length; i++) {
                    if (i >= charWord.length) {
                        break;
                    }
                    if (charStrRandom[i] == charWord[i]) {
                        charGtid[i] = charStrRandom[i];
                    }
                }

                System.out.println(charGtid);
            }
        }
    }
}
