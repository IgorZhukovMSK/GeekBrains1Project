package Lesson6;

public class Amount{
    protected static int numb;

    public Amount() {
        numb++;
    }

    public static int counter() {
        return numb;
    }
}
