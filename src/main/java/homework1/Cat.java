package homework1;

public class Cat implements Runnable, Jumpable{

    String name;
    int age;
    int height = 300;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void run() {
        System.out.println("кот бежит");
    }

    @Override
    public void jump() {
        System.out.println("кот прыгает");
    }
}
