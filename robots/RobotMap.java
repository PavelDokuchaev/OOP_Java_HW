package robots;

import java.util.ArrayList;
import java.util.List;

public class RobotMap {

    private final int n;
    private final int m;
    private int numberRobots = 5; // 2 задание

    private final List<Robot> robots;

    public RobotMap(int n, int m) {
        this.n = n;
        this.m = m;
        this.numberRobots = 5; // 2 задание
        validateMap(n, m); // 1 задание
        this.robots = new ArrayList<>();
    }

    public RobotMap(int n, int m, int numberRobots) {
        this.n = n;
        this.m = m;
        this.numberRobots = numberRobots; // 2 задание
        validateMap(n, m); // 1 задание
        this.robots = new ArrayList<>();
    }

    public Robot createRobot(Point point) {
        validateNumRobots(); // 2 задание
        validatePoint(point);
        Robot robot = new Robot(point);
        robots.add(robot);
        return robot;
    }

    private void validateNumRobots() { // 2 задание
        if (robots.size() == numberRobots) {
            throw new IllegalStateException("Превышено количество роботов!");
        }
    }

    private void validateMap(int n, int m) { // 1 задание
        if (n <= 0 || n > 10 || m <= 0 || m > 10) {
            throw new IllegalStateException(
                    "Некорректное значение координат! Значение координат должно быть больше 0, но не превышать 10.");
        }
    }

    private void validatePoint(Point point) {
        validatePointIsCorrect(point);
        validatePointIsFree(point);
    }

    private void validatePointIsCorrect(Point point) {
        if (point.x() < 0 || point.x() > n || point.y() < 0 || point.y() > m) {
            throw new IllegalStateException("Некорректное значение точки!");
        }
    }

    private void validatePointIsFree(Point point) {
        for (Robot robot : robots) {
            if (robot.point.equals(point)) {
                throw new IllegalStateException("Точка " + point + " занята!");
            }
        }

    }

    public class Robot {

        public static final Direction DEFAULT_DIRECTION = Direction.TOP;

        private Direction direction;
        private Point point;

        public Robot(Point point) {
            this.direction = DEFAULT_DIRECTION;
            this.point = point;
        }

        public void changeDirection(Direction direction) {
            this.direction = direction;
        }

        public void move(int num) { // 3 задание
            Point newPoint = switch (direction) {
                case TOP -> new Point(point.x() - num, point.y());
                case RIGHT -> new Point(point.x(), point.y() + num);
                case BOTTOM -> new Point(point.x() + num, point.y());
                case LEFT -> new Point(point.x(), point.y() - num);
            };

            validatePoint(newPoint);

            System.out.println("Робот переместился с " + point + "на" + newPoint);
            this.point = newPoint;
        }

        public void move() {
            Point newPoint = switch (direction) {
                case TOP -> new Point(point.x() - 1, point.y());
                case RIGHT -> new Point(point.x(), point.y() + 1);
                case BOTTOM -> new Point(point.x() + 1, point.y());
                case LEFT -> new Point(point.x(), point.y() - 1);
            };

            validatePoint(newPoint);

            System.out.println("Робот переместился с " + point + "на" + newPoint);
            this.point = newPoint;
        }

        @Override
        public String toString() {

            return point.toString() + ", [" + direction.name() + "]";
        }

    }

}
