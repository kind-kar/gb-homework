public class Man implements Runnable, Jumpable {

    String name;
    int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void jump() {
        System.out.println("человек прыгает");
    }

    @Override
    public void run() {
        System.out.println("человек бежит");
    }
}
