package Lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public static void doTask1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void doTask2(int[] count) {
        int sum = 0;
        for (int i = 0; i < count.length; i++) {
            count[i] = i * 3;
        }
        for (int i : count) {
            System.out.print(i + " ");
        }
    }

    public static void doTask3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void doTask4() {

        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
/*          Изначально было придумано вот такое решение.
            num[0][2] = 1;
            num[2][0] = 1;

 */
                if (i == j || i == 0 && j < arr.length - 1 || i == arr.length - 1 && j == 0) {  // не уверен, что правильное решение, прошу прокомментировать, т.к. при массииве 5Х5, уже не работает.
                    arr[i][j] = 1;
                }
            }
        }
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i) + " ");
        }
    }

    public static void doTask5(int[] arr) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min = " + min + " ; " + "max = " + max);
    }

    public static boolean doTask6(int[] checkBalance) {

        int[] arr1 = new int[checkBalance.length - 2];
        int[] arr2 = Arrays.copyOfRange(checkBalance, checkBalance.length - 2, checkBalance.length);

        int sumArr1 = 0;
        int sumArr2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = checkBalance[i];
            sumArr1 += arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            sumArr2 += arr2[i];
        }

        if (sumArr1 == sumArr2) {
            return true;
        } else {
            return false;
        }
    }
}




