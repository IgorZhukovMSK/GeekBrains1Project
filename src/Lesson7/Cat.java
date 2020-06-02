package Lesson7;

public class Cat {
    private String name;
    private int food;
    private boolean ate;

    public Cat(String name, int food) {
        this.name = name;
        this.food = food;
        this.ate = true;
    }

    public void printCat() {
        System.out.println(String.format("Кот %s поел из миски" + (!ate ? " и наелся" : " и остался голодным т.к. мало еды"), name));
    }

    public void eat(BowlFood bf) {

        if (ate && bf.foodLeft(food)) {
            ate = false;
        }
        System.out.println();
    }
}
