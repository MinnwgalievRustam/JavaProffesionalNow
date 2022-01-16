package reflection.task1;

public class Animal {
    private String name ="Tima";
    public int age = 10;
    protected int paws = 4;

    public Animal(String name, int age, int paws) {
        this.name = name;
        this.age = age;
        this.paws = paws;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }
}
