package Lesson6;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Барсик");
        System.out.println(cat.name);
        cat.run(15);
        cat.swim(10);
        cat.jump(50);

        Dog dog = new Dog("Sous");
        System.out.println(dog.name);

        dog.swim(11);
        dog.run(510);
        dog.jump(0.9);

        Animal an = new Animal("Gaz");
        System.out.println(an.name);
        an.run(200);
        an.swim(500);

        System.out.printf("Всего создано животных: %s, из них собак: %s, кошек: %s %n", Animal.counter(), Dog.counter(), Cat.counter());

    }
}






