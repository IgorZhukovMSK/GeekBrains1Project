package Lesson7;

public class Cat {
    private String name;
    private int food;

    public Cat (String name, int food){
        this.name = name;
        this.food = food;

    }

    public void printCat(){
        System.out.println(String.format("Кот с именем %s",name));
        // поел -наелся : остался голодный
    }


}
