package 实验4;

import 实验4.Circle;
import 实验4.Point;

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

    public static void main(String[] args) {
        System.out.println("--------------------");

        // 测试1
        System.out.println("测试1:");
        Point p_1 = new Point();
        Circle c_1 = new Circle();
//        p_1.x;
//        p_1.y;
//        c_1.center;
//        c_1.radius;
        System.out.println("--------------------");

        // 测试2
        System.out.println("测试2:");
        Point p_2_1 = new Point();
        Point p_2_2 = new Point(0, 10);
        System.out.println(p_2_1.getX()); // 父类的x
        System.out.println(p_2_1.getY());
        System.out.println(p_2_1.distance(p_2_2));
        System.out.println("--------------------");

        // 测试3
        System.out.println("测试3:");
        Circle c_3_1 = new Circle();
        Circle c_3_2 = new Circle(0, 0, 10);
        System.out.println(c_3_1.getCenter().getX());
        System.out.println(c_3_1.getCenter().getY());
        System.out.println(c_3_1.area());
        System.out.println(c_3_1.perimeter());
        print(c_3_1.relation(c_3_2));
        System.out.println("--------------------");

        // 测试4
        System.out.println("测试4:");
        System.out.println(p_1.toString());
        System.out.println("--------------------");

        // 测试5
        System.out.println("测试5:");
        System.out.println(c_1.toString());
        System.out.println("--------------------");

        // 测试6
        System.out.println("测试6:");
        Point p_6_1 = new Point();
        Point p_6_2 = new Point(0, 10);
        System.out.println(p_6_1.equals(p_6_2));
        System.out.println("--------------------");

        // 测试7
        System.out.println("测试7:");
        Point p_7_1 = new Point();
        Point p_7_2 = new Point(0, 0);
        System.out.println(p_7_1.equals(p_7_2));
        System.out.println("--------------------");

        // 测试8
        System.out.println("测试8:");
        Point p_8_1 = new Point();
        实验2.Point p_8_2 = new 实验2.Point(0, 0);
        System.out.println(p_8_1.equals(p_8_2));
        System.out.println("--------------------");

        // 测试9
        System.out.println("测试9:");
        Point p_9_1 = new Point();
        实验2.Point p_9_2 = new 实验2.Point(0, 0);
        System.out.println(p_9_2.equals(p_9_1));
        System.out.println("--------------------");

        // 测试10
        System.out.println("测试10:");
        Circle c_10_1 = new Circle();
        Circle c_10_2 = new Circle(0, 0, 10);
        System.out.println(c_10_1.equals(c_10_2));
        System.out.println("--------------------");

        // 测试11
        System.out.println("测试11:");
        Circle c_11_1 = new Circle();
        Circle c_11_2 = new Circle(0, 0, 0);
        System.out.println(c_11_1.equals(c_11_2));
        System.out.println("--------------------");

        // 测试12
        System.out.println("测试12:");
        Circle c_12_1 = new Circle();
        Point p_12_1 = new Point(0, 0);
        Circle c_12_2 = new Circle(p_12_1, 0);
        System.out.println(c_12_1.equals(c_12_2));
        System.out.println(c_12_1.equals(p_12_1));
        System.out.println(p_12_1.equals(c_12_1));
        System.out.println("--------------------");

        // 测试13
        System.out.println("测试13:");
        Circle c_13_1 = new Circle();
        实验2.Point p_13_1 = new 实验2.Point();
        Circle c_13_2 = new Circle(p_13_1, 0);
        System.out.println(c_13_1.equals(c_13_2));
        System.out.println("--------------------");

        // 测试14
        System.out.println("测试14:");
        Circle c_14_1 = new Circle();
        实验2.Circle c_14_2 = new 实验2.Circle(0, 0, 0);
        System.out.println(c_14_1.equals(c_14_2));
        System.out.println(c_14_2.equals(c_14_1));
        System.out.println("--------------------");
    }
}
