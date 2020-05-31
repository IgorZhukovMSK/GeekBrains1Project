package Lesson6;

public class Dog extends Animal {
    private static int numb;
    public Dog(String name) {
        this.setName(name);

    }

    public static int counter() {
        numb++;
        return numb;
    }

    @Override
    public void run(int run) {
        if (run <= 500) {
            System.out.println(String.format("%s пробежал %d м.", this.getName(), run));
        } else {
            System.out.println(String.format("%s не может пробежать %d м.", this.getName(), run));
        }
    }

    @Override
    public void swim(int swim) {
        if (swim <= 10) {
            System.out.println(String.format("%s проплыл %d м.", this.getName(), swim));
        } else {
            System.out.println(String.format("%s не может проплыть %d м.", this.getName(), swim));
        }
    }

    @Override
    public void jump(double jump) {
        if (jump <= 0.5) {
            System.out.println(String.format("%s прыгнул на %d м.", this.getName(), jump));
        } else {
            System.out.println(String.format("%s не может прыгнуть на %s м.", this.getName(), jump));
        }
    }
}

