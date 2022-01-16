package anotation.task;

import java.lang.reflect.Method;

public class Dispatcher {
    /*
     * TODO:
     *  ENG
     *  Create your own annotation using the @Repeteable annotation with Java 8, call the annotation pulling twice
     *   different options perform addition of 2 numbers.
     *   @MathAnno(num1 = 50)
     *   @MathAnno(num2 = 100)
     *   public void mathSum(int num1, int num2)
     *  RU
     *  Создать свою аннотацию используя аннотацию @Retention с Java 8, вызвать дважды аннотацию подтягивая
     *  разные параметры выполнить сложение 2-х чисел.
     *  @MathAnno(num1 = 50)
     *  @MathAnno(num2 = 100)
     *  public void mathSum(int num1, int num2)
     */
    public static void main(String[] args) {
        MathAnno math = new MathAnno();
        Class<?> cl = MathAnno.class;
        try {
            Method m = cl.getDeclaredMethod("calculateOne", int.class, int.class);
            Method m2 = cl.getDeclaredMethod("calculateTwo", int.class, int.class);
            MyAnnotation myAnnotation = m.getAnnotation(MyAnnotation.class);
            MyAnnotation myAnnotation2 = m2.getAnnotation(MyAnnotation.class);
            math.calculateOne(myAnnotation.num1(), myAnnotation.num2());
            math.calculateTwo(myAnnotation2.num1(), myAnnotation2.num2());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
