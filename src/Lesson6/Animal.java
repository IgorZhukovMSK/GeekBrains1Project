package Lesson6;

public class Animal extends Amount {

    protected String name;

    public Animal() {

    }

    public Animal(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int run) {
        System.out.println(this.name + " пробежал " + run + " м."); // подумать что бы в одно месте выводилось на экран, а не во всех переопределенных методах
    }

    public void jump(double jump) {
        System.out.println(this.name + " прыгнул на " + jump + " м.");
    }

}

