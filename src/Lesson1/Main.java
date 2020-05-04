package Lesson1;

public class Main {

    public static void main(String[] args) {

        byte b = 1;
        short sh = 2;
        int in = 3;
        long l = 4;
        float f = 5;
        double d = 6;
        boolean bool = true;
        char ch = 'Z';

    }

    public static double expressionEvaluation(double a, double b, double c, double d) {

        double sum = a * (b + (c / d));
        return sum;
    }

    public static boolean comparisonOfNumbers(int a, int b) {

        int sum = a + b;
        if (sum >= 10 && sum <= 20)
            return true;
        else
            return false;
    }

    public static void positiveOrNegativeNumber(int a) {

        if (a >= 0) {
            System.out.println(a + " положительное число");
        } else {
            System.out.println(a + " отрицательное число");
        }
    }

    public static boolean positiveOrNegativeNumberTrueFalse(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void nameOutput(String name) {

        System.out.println("Привет, " + name);
    }

    public static void leapYear(int a) {
        if ((a % 4) == 0 && (a % 100) != 0 || (a % 400) == 0) {

            System.out.println(a + " является високосным годом");
        } else {
            System.out.println(a + " является невисокосный годом");
        }
    }
}



