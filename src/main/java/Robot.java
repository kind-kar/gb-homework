public class Robot implements Player{

    String name;
    int height;

    public Robot(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public void jump() {
        System.out.println("робот прыгает");
    }

    @Override
    public void run() {
        System.out.println("робот бежит");
    }
}
