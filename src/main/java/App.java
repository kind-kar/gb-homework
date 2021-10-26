public class App {

    public static void main(String args[]) {
        Cat cat = new Cat("Barsik", 12);
        Man man = new Man("John", 30);
        Robot robot = new Robot("Stu", 234);

        Wall wall1 = new Wall(400);
        Treadmill treadmill1 = new Treadmill();
        Wall wall2 = new Wall(130);
        Treadmill treadmill2 = new Treadmill();

        Object[] players = {cat, man, robot};
        Object[] obstacles = {wall1, treadmill1, treadmill2, wall2};

        for (Object pl : players) {
            for (Object obst : obstacles) {
                if (obst instanceof Wall) {
                    if (pl instanceof Cat) {
                        cat.jump();
                        break;
                    }
                    if (pl instanceof Man) {
                        man.jump();
                    }
                    if (pl instanceof Robot) {
                        robot.jump();
                    }
                }
                if (obst instanceof Treadmill) {
                    if (pl instanceof Cat) {
                        cat.run();
                    }
                    if (pl instanceof Man) {
                        man.run();
                    }
                    if (pl instanceof Robot) {
                        robot.run();
                    }
                }
            }
        }
    }
}
