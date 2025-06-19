package 实验3;

import 实验2.Circle;
import 实验2.Point;


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
        Color cr_2 = new Color();
        System.out.println(cr_2.getRed());
        System.out.println(cr_2.getGreen());
        System.out.println(cr_2.getBlue());
        System.out.println("--------------------");

        // 测试3
        System.out.println("测试3:");
        Color cr_3 = new Color(255, 255, 255);
        System.out.println(cr_3.getRed());
        System.out.println(cr_3.getGreen());
        System.out.println(cr_3.getBlue());
        System.out.println("--------------------");

        // 测试4
        System.out.println("测试4:");
        Color cr_4 = new Color(355, 355, 355);
        System.out.println(cr_4.getRed());
        System.out.println(cr_4.getGreen());
        System.out.println(cr_4.getBlue());
        System.out.println("--------------------");

        // 测试5
        System.out.println("测试5:");
        Color cr_5 = new Color(255, 255, 255);
        cr_5.setRed(355);
        cr_5.setGreen(355);
        cr_5.setBlue(355);
        System.out.println(cr_5.getRed());
        System.out.println(cr_5.getGreen());
        System.out.println(cr_5.getBlue());
        System.out.println("--------------------");

        // 测试6
        System.out.println("测试6:");
        ColoredCircle crc_6 = new ColoredCircle();
        System.out.println(crc_6.getRadius());
        System.out.println(crc_6.area());
        System.out.println(crc_6.perimeter());
        System.out.println(crc_6.getCenter().getX()); // 前面返回一个Point，可继续调用Point的功能
        System.out.println(crc_6.getCenter().getY());
        System.out.println(crc_6.getBorderColor().getRed()); // 前面返回一个Color，可继续调用Color里面的getRed
        System.out.println(crc_6.getCenterColor().getRed());

        ColoredCircle crc_6_1 = new ColoredCircle(null, -1);
        System.out.println(crc_6_1.getRadius());
        System.out.println(crc_6_1.area());
        System.out.println(crc_6_1.perimeter());
        System.out.println(crc_6_1.getCenter().getX()); // 前面返回一个Point，可继续调用Point的功能
        System.out.println(crc_6_1.getCenter().getY());
        System.out.println(crc_6_1.getBorderColor().getRed()); // 前面返回一个Color，可继续调用Color里面的getRed
        System.out.println(crc_6_1.getCenterColor().getRed());

        ColoredCircle crc_6_2 = new ColoredCircle(null, null);
        System.out.println(crc_6_2.getRadius());
        System.out.println(crc_6_2.area());
        System.out.println(crc_6_2.perimeter());
        System.out.println(crc_6_2.getCenter().getX()); // 前面返回一个Point，可继续调用Point的功能
        System.out.println(crc_6_2.getCenter().getY());
        System.out.println(crc_6_2.getBorderColor().getRed()); // 前面返回一个Color，可继续调用Color里面的getRed
        System.out.println(crc_6_2.getCenterColor().getRed());
        System.out.println("--------------------");

        // 测试7
        System.out.println("测试7:");
        ColoredCircle crc_7 = new ColoredCircle(new Point(0, 0), 10);
        System.out.println(crc_7.getRadius());
        System.out.println(crc_7.area());
        System.out.println(crc_7.perimeter());
        System.out.println(crc_7.getCenter().getX());
        System.out.println(crc_7.getCenter().getY());
        System.out.println(crc_7.getBorderColor().getRed());
        System.out.println(crc_7.getCenterColor().getRed());
        System.out.println("--------------------");

        // 测试8
        System.out.println("测试8:");
        ColoredCircle crc_8 = new ColoredCircle(new Color(0, 0, 0), new Color(1, 1, 1));
        System.out.println(crc_8.getRadius());
        System.out.println(crc_8.area());
        System.out.println(crc_8.perimeter());
        System.out.println(crc_8.getCenter().getX());
        System.out.println(crc_8.getCenter().getY());
        System.out.println(crc_8.getCenterColor().getRed());
        System.out.println(crc_8.getCenterColor().getBlue());
        System.out.println(crc_8.getCenterColor().getGreen());
        System.out.println(crc_8.getBorderColor().getRed());
        System.out.println(crc_8.getBorderColor().getBlue());
        System.out.println(crc_8.getBorderColor().getGreen());
        System.out.println("--------------------");

        // 测试9
        System.out.println("测试9:");
        ColoredCircle crc_9 = new ColoredCircle(new Point(1, 1), 10, new Color(0, 0, 0), new Color(1, 1, 1));
        System.out.println(crc_9.getRadius());
        System.out.println(crc_9.area());
        System.out.println(crc_9.perimeter());
        System.out.println(crc_9.getCenter().getX());
        System.out.println(crc_9.getCenter().getY());
        System.out.println(crc_9.getCenterColor().getRed());
        System.out.println(crc_9.getCenterColor().getBlue());
        System.out.println(crc_9.getCenterColor().getGreen());
        System.out.println(crc_9.getBorderColor().getRed());
        System.out.println(crc_9.getBorderColor().getBlue());
        System.out.println(crc_9.getBorderColor().getGreen());
        System.out.println("--------------------");

        // 测试10
        System.out.println("测试10:");
        ColoredCircle crc_10 = new ColoredCircle(null, -10, null, null);
        System.out.println(crc_10.getRadius());
        System.out.println(crc_10.area());
        System.out.println(crc_10.perimeter());
        System.out.println(crc_10.getCenter().getX());
        System.out.println(crc_10.getCenter().getY());
        System.out.println(crc_10.getCenterColor().getRed());
        System.out.println(crc_10.getCenterColor().getBlue());
        System.out.println(crc_10.getCenterColor().getGreen());
        System.out.println(crc_10.getBorderColor().getRed());
        System.out.println(crc_10.getBorderColor().getBlue());
        System.out.println(crc_10.getBorderColor().getGreen());
        System.out.println("--------------------");

        // 测试11
        System.out.println("测试11:");
        ColoredCircle crc_11 = new ColoredCircle(new Color(1, 1, 1), new Color(2, 2, 2));
        crc_11.setCenterColor(null);
        System.out.println(crc_11.getCenterColor().getRed());
        System.out.println(crc_11.getCenterColor().getBlue());
        System.out.println(crc_11.getCenterColor().getGreen());
        System.out.println(crc_11.getBorderColor().getRed());
        System.out.println(crc_11.getBorderColor().getBlue());
        System.out.println(crc_11.getBorderColor().getGreen());
        System.out.println("--------------------");

        // 测试12
        System.out.println("测试12:");
        ColoredCircle crc_12 = new ColoredCircle(new Color(1, 1, 1), new Color(2, 2, 2));
        crc_12.setCenterColor(null);
        System.out.println(crc_12.getCenterColor().getRed());
        System.out.println(crc_12.getCenterColor().getBlue());
        System.out.println(crc_12.getCenterColor().getGreen());
        System.out.println(crc_12.getBorderColor().getRed());
        System.out.println(crc_12.getBorderColor().getBlue());
        System.out.println(crc_12.getBorderColor().getGreen());
        System.out.println("--------------------");

        // 测试13
        System.out.println("测试13:");
        Circle c_13 = new Circle();
        ColoredCircle crc_13 = new ColoredCircle();
        print(crc_13.relation(c_13));
        System.out.println("--------------------");

        // 测试14
        System.out.println("测试14:");
        ColoredCircle crc_14 = new ColoredCircle();
        ColoredCircle crc_14_1 = new ColoredCircle();
        print(crc_14.relation(crc_14_1));
        System.out.println("--------------------");

        // 测试15
        System.out.println("测试15:");
        ColoredCircle crc_15 = new ColoredCircle(new Color(1, 1, 1), new Color(1, 1, 1));
        ColoredCircle crc_15_1 = new ColoredCircle();
        print(crc_15_1.relation(crc_15));
        System.out.println("--------------------");
    }
}
