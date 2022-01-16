package reflection.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Cat {
    /*
    * TODO:
    *  ENG
    *  Create 2 classes, Animal and Cat.
    *  In the Animal class, initialize 3 different modifier fields.
    *  In the Cat class, use reflection to access the fields of the Animal class and change the content of each
    *  from the fields.
    *  RU
    *  Создайте 2 класса, Animal и Cat.
    *  В классе Animal инициализируйте 3 поля различных модификаторов.
    *  В классе Cat используя рефлексию получите доступ к полям класса Animal и измените содержимое каждого
    *  из полей.
    */


    public static void main(String[] args) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";

        Animal animalReflection = new Animal();
        Class<?> a1 = animalReflection.getClass();
        try {
            Class<?>[] paramTypes = new Class<?>[]{
                    String.class,
                    int.class,
                    int.class
            };

            Constructor<?> ctr = a1.getConstructor(paramTypes);
            Animal animal = (Animal) ctr.newInstance( "Marsel",6,5);


            System.out.println(s + "Fields: " + s1 + " Age - " + animal.getAge() + ", Name - " + animal.getName() + ", Paws - " + animal.getPaws() );
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
