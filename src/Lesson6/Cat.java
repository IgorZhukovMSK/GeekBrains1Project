package Lesson6;

public class Cat extends Animal {

    private static int numb;

    public Cat(String name) {
        this.name = name;
    }

    public static int counter() {
        numb++;
        return numb;
    }

    @Override
    public void run(int run) {
        if (run <= 200) {
            System.out.println(this.name + " пробежал " + run + " м.");
        } else {
            System.out.println(this.name + " не может пробежать " + run + " м.");
        }
    }

    @Override
    public void swim(int swim) {
        System.out.println("Кот " + this.name + " не умеет плавать");
    }

    @Override
    public void jump (double jump){
        if (jump <= 2) {
            System.out.println(this.name + " прыгнул на " + jump + " м.");
        } else {
            System.out.println(this.name + " не может прыгнуть на " + jump + " м.");
        }
    }


}

