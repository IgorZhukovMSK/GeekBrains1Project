package Lesson6;

public class Animal extends Amount {
    String name;


    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void run(int run) {
        System.out.println(this.name + " пробежал " + run + " м."); // подумать что бы в одно месте выводилось на экран, а не во всех переопределенных методах
    }

    public void swim(int swim) {
        System.out.println(this.name + " проплыл " + swim + " м.");

    }

    public void jump (double jump){
        System.out.println(this.name + " прыгнул на " + jump + " м.");
    }

}

