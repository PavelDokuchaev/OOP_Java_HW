package robots;

public class GameMain {
    public static void main(String[] args) {
        // Карта с роботами.
        // Карта имеет размер nxm, где n и m - положительные целые числа.
        // Должна быть возможность создания робота на какой-то точке на карте.
        // Точка на карте описывается двумя целочисленными координатами.
        // Роботы могут перемещаться по карте вперед.
        // В одной точке не может находиться несколько роботов.
        // HW
        // 1. Добавить валидацию параметров при создании карты.
        // 2. Реализовать возможность задать ограничение по количеству создаваемых
        // на карте роботов (в конструкторе карты). При этом если параметр не указан, то
        // используем значение по-умолчанию: 5.
        // 3. *Реализовать возможность вызова метода move с параметром - количество
        // шагов вперед. Подсказка: можно несколько раз вызвать метод #move

        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */

        RobotMap map = new RobotMap(5, 5, 5);

        RobotMap.Robot robot = map.createRobot(new Point(5, 1));
        // RobotMap.Robot robot2 = map.createRobot(new Point(2, 3));
        RobotMap.Robot robot3 = map.createRobot(new Point(3, 3));
        RobotMap.Robot robot4 = map.createRobot(new Point(4, 3));
        RobotMap.Robot robot5 = map.createRobot(new Point(5, 3));
        RobotMap.Robot robot6 = map.createRobot(new Point(1, 2));
        System.out.println(robot); // [2, 3], [TOP]
        // System.out.println(robot2);
        System.out.println(robot3);
        System.out.println(robot4);
        System.out.println(robot5);
        System.out.println(robot6);
        robot.move(2);
        // System.out.println(robot); // [1, 3], [TOP]
        // robot.changeDirection(Direction.BOTTOM);
        // robot.move();
        // robot.move();
        // robot.changeDirection(Direction.LEFT);
        // robot.move();
        // System.out.println(robot); // [3, 2], [LEFT]

    }

}
