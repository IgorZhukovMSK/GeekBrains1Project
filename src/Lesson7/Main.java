package Lesson7;

public class Main {
    public static void main(String[] args) {

        BowlFood bowlFood = new BowlFood(50);

        Cat[] cats = new Cat[5];

        cats[0] = new Cat("d", 30);
        cats[1] = new Cat("d1", 15);
        cats[2] = new Cat("d2", 20);
        cats[3] = new Cat("d3", 10);
        cats[4] = new Cat("d4", 30);


        for (int i = 0; i < cats.length; i++) {

            cats[i].eat(bowlFood);
            cats[i].printCat();
            bowlFood.printInfo();
        }

        bowlFood.addBowlFood(100);
        bowlFood.printInfo();
    }
}
