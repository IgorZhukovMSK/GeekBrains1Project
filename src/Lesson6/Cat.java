package Lesson6;

public class Cat extends Animal {
    private static int numb;
    public Cat(String name) {
        this.setName(name);
    }

    public static int counter() {
        numb++;
        return numb;
    }

    @Override
    public void run(int run) {
        if (run <= 200) {
            System.out.println(String.format("%s пробежал %d м.", this.getName(), run));
        } else {
            System.out.println(String.format("%s не может пробежать %d м.", this.getName(), run));
        }
    }

    @Override
    public void swim(int swim) {
        System.out.println(String.format ("Кот %s не умеет плавать",this.getName()));
    }

    @Override
    public void jump (double jump){
        if (jump <= 2) {
            System.out.println(String.format("%s прыгнул на %d м.", this.getName(), jump));
        } else {
            System.out.println(String.format("%s не может прыгнуть на %s м.", this.getName(), jump));
        }
    }


}

