package Lesson6;

import org.w3c.dom.ls.LSOutput;

public class Dog extends Animal {

    private static int numb;

    public Dog(String name) {
        this.name = name;
    }

    public static int counter() {
        numb++;
        return numb;
    }

     @Override
    public void run(int run) {
        if (run <= 500) {
            System.out.println(this.name + " пробежал " + run + " м.");
        } else {
            System.out.println(this.name + " не может пробежать " + run + " м.");
        }
    }

    @Override
    public void swim(int swim) {
        if (swim <= 10) {
            System.out.println(this.name + " проплыл " + swim + " м.");
        } else {
            System.out.println(this.name + " не может проплыть " + swim + " м.");
        }
    }
}

