package Lesson7;

public class BowlFood {

    private int food;

    public BowlFood(int food) {
        this.food = food;

    }

    public boolean foodLeft(int balanceFood) {

        int balance = food - balanceFood;
        if (balance < 0)
            return false;
        food -= balanceFood;
        return true;

    }

    public void printInfo() {
        System.out.println(String.format("В миске осталось %s еды", food));

    }

    public void addBowlFood(int food) {
        System.out.println(String.format("В миске стало %s еды", food));
        this.food += food;
    }

}
