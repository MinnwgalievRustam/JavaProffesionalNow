package anotation.task;

public class MathAnno {
    @MyAnnotation(num1 = 50, num2 = 30)

    public void calculateOne(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    @MyAnnotation(num1 = 10, num2 = 20)
    public void calculateTwo(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
