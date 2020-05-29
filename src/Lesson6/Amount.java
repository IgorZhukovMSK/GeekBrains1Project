package Lesson6;

public class Amount{
    private static int numb;

    public Amount() {
        numb++;
    }

    public static int counter() {
        return numb;
    }
}
