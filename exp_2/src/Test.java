public class Test {

    public static void print(int x) {
        if (x == 0) {
            System.out.println("同一圆");
        } else if (x == 1) {
            System.out.println("同心圆");
        } else if (x == 2) {
            System.out.println("相交的圆");
        } else if (x == 3) {
            System.out.println("分离的圆");
        } else if (x == 4) {
            System.out.println("包含的圆");
        } else {
            System.out.println("相切的圆");
        }
    }

    public static void printC(Circle c) {
        System.out.printf("圆心:(%d, %d)\n", c.center.x, c.center.y);
        System.out.printf("半径:%d\n", c.radius);
        System.out.printf("面积:%f\n", c.area());
        System.out.printf("周长:%f\n", c.perimeter());
    }

    public static void main(String[] args) {
        System.out.println("--------------------");

        // 测试1
        System.out.println("测试1:");
        Point p1 = new Point();
        Point p2 = new Point(0, 3);
        System.out.println("p1.getX:" + p1.getX());
        System.out.println("p1.getY:" + p1.getY());
        System.out.println("p2.getX:" + p2.getX());
        System.out.println("p2.getY:" + p2.getY());
        System.out.println("p1.distance(p2):" + p1.distance(p2));
        System.out.println("--------------------");

        // 测试2
        System.out.println("测试2:");
        Circle c_2 = new Circle();
        printC(c_2);
        System.out.println("--------------------");

        // 测试3
        System.out.println("测试3:");
        Circle c_3 = new Circle(1, 1, 10);
        printC(c_3);
        System.out.println("--------------------");

        // 测试4
        System.out.println("测试4:");
        Circle c_4 = new Circle(1, 1, -1);
        printC(c_4);
        System.out.println("--------------------");

        // 测试5
        System.out.println("测试5:");
        Point p_5 = new Point(1, 1);
        Circle c_5 = new Circle(p_5, 10);
        printC(c_5);
        System.out.println("--------------------");

        // 测试6
        System.out.println("测试6:");
        Point p_6 = new Point(1, 1);
        Circle c_6 = new Circle(p_6, -1);
        printC(c_6);
        System.out.println("--------------------");

        // 测试7
        System.out.println("测试7:");
        Circle c_7 = new Circle(null, 10);
        printC(c_7);
        System.out.println("--------------------");

        // 测试8
        System.out.println("测试8:");
        Point p_8 = new Point();
        System.out.printf("坐标:(%d, %d)\n", p_8.x, p_8.y);
        p_8.setX(10);
        p_8.setY(10);
        System.out.printf("改后坐标:(%d, %d)\n", p_8.x, p_8.y);
        System.out.println("--------------------");

        // 测试9
        System.out.println("测试9:");
        Circle c_9 = new Circle();
        System.out.printf("半径:%d\n", c_9.radius);
        c_9.setRadius(20);
        System.out.printf("改后半径:%d\n", c_9.radius);
        System.out.println("--------------------");

        // 测试10
        System.out.println("测试10:");
        Circle c_10 = new Circle();
        System.out.printf("半径:%d\n", c_9.radius);
        c_10.setRadius(-20);
        System.out.printf("改后半径:%d\n", c_9.radius);
        System.out.println("--------------------");

        // 测试11
        System.out.println("测试11:");
        Circle c_11 = new Circle();
        System.out.printf("圆心:(%d, %d)\n", c_11.center.x, c_11.center.y);
        c_11.setCenter(new Point(20, 20));
        System.out.printf("改后圆心:(%d, %d)\n", c_11.center.x, c_11.center.y);
        System.out.println("--------------------");

        // 测试12
        System.out.println("测试12:");
        Circle c_12 = new Circle();
        System.out.printf("圆心:(%d, %d)\n", c_12.center.x, c_12.center.y);
        c_12.setCenter(null);
        System.out.printf("改后圆心:(%d, %d)\n", c_12.center.x, c_12.center.y);
        System.out.println("--------------------");

        // 测试13
        System.out.println("测试13:");
        Circle c_13_1 = new Circle();
        Circle c_13_2 = new Circle(0, 0, 0);
        print(c_13_1.relation(c_13_2));
        System.out.println("--------------------");

        // 测试14
        System.out.println("测试14:");
        Circle c_14_1 = new Circle();
        Circle c_14_2 = new Circle(0, 0, 1);
        print(c_14_1.relation(c_14_2));
        System.out.println("--------------------");

        // 测试15
        System.out.println("测试15:");
        Circle c_15_1 = new Circle(0, 0, 10);
        Circle c_15_2 = new Circle(1, 1, 5);
        print(c_15_1.relation(c_15_2));
        System.out.println("--------------------");

        // 测试16
        System.out.println("测试16:");
        Circle c_16_1 = new Circle(0, 0, 10);
        Circle c_16_2 = new Circle(0, 5, 10);
        print(c_16_1.relation(c_16_2));
        System.out.println("--------------------");

        // 测试17
        System.out.println("测试17:");
        Circle c_17_1 = new Circle(0, 0, 10);
        Circle c_17_2 = new Circle(0, 20, 10);
        print(c_17_1.relation(c_17_2));
        System.out.println("--------------------");
    }
}
