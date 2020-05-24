package Lesson5;

public class Main {

    public static void main(String[] args) {

        Worker[] persArray = new Worker[5];

        persArray[0] = new Worker("Petrov Ivan", "Administrator", "petrov@mail.ru", "81234567", 20000, 20);
        persArray[1] = new Worker("Ivanov Petr", "Artist", "ivanov@mail.ru", "815674414552", 40000, 30);
        persArray[2] = new Worker("Kozlov Vasya", "Assistant", "kozlov@mail.ru", "8265942", 30000, 45);
        persArray[3] = new Worker("Vasilkov Dima", "Banker", "vasilkov@mail.ru", "812689741", 60000, 50);
        persArray[4] = new Worker("Karpov Lev", "Coach", "karpov@mail.ru", "832565121", 10000, 68);


        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) {
                persArray[i].printWorker();
            }
        }
    }
}
