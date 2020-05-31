package Lesson6;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Барсик");
        System.out.println(cat.getName());
        cat.run(15);

        cat.jump(50);

        Animal an1 = new Animal("Gaz2");
        System.out.println(an1.getName());
        an1.run(200);


        Dog dog = new Dog("Sous");
        System.out.println(dog.getName());

        dog.swim(11);
        dog.run(510);
        dog.jump(0.9);

        Animal an = new Animal("Gaz");
        System.out.println(an.getName());
        an.run(200);


//        System.out.println("test" + dog.(dog));

        System.out.printf("Всего создано животных: %s, из них собак: %s, кошек: %s %n", Animal.counter(), Dog.counter(), Cat.counter());

    }
}






