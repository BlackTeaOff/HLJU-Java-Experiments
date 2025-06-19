package 实验2;

public class Circle {

    private Point center;
    private int radius;

    public Circle(Point c, int r) {
        if (c == null) {
            center = new Point(0, 0);
        } else {
            this.center = c;
        }
        this.radius = Math.max(r, 0);
    }

    public Circle(int x, int y, int r) {
        this.center = new Point(x, y);
        this.radius = Math.max(r, 0); // 比0小就返回0
    }

    public Circle() {
        this.center = new Point(0, 0);
        this.radius = 0;
    }

    void setRadius(int r) {
        if (r > 0) {
            radius = r;
        }
    }

    void setCenter(Point c) {
        if (c != null) {
            this.center = c;
        }
    }

    public int getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    // 周长
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
//        double area = Math.pow(radius, 2);
        return Math.PI * radius * radius;
    }

    public int relation(Circle c) {
        double d = center.distance(c.center);
        int r1 = radius;
        int r2 = c.radius;

        if (d == 0 && r1 == r2) { // 同一
            return 0;
        }
        if (d == 0) { // 同心
            return 1;
        }
        if (d < r1 + r2 && d > Math.abs(r1 - r2)) { // 相交，但不内含(因为内含也满足这个)
            return 2;
        }
        if (d >= r1 + r2) { // 相离
            return 3;
        }
        if (d < Math.abs(r1 - r2)) { // 内含
            return 4;
        }
        return 5;
    }


//    public static void main(String[] args) {
//        // 测试2
//        Circle c1 = new Circle();
//        System.out.printf("(%d, %d)\n", c1.center.x, c1.center.y);
//        System.out.println(c1.radius);
//        System.out.println(c1.perimeter());
//        System.out.println(c1.area());
//        System.out.println("--------------------");
//
//        // 测试3
//        Circle c2 = new Circle(1, 1, 10);
//        System.out.printf("(%d, %d)\n", c2.center.x, c2.center.y);
//        System.out.println(c2.radius);
//        System.out.println(c2.perimeter());
//        System.out.println(c2.area());
//        System.out.println("--------------------");
//
//        // 测试4
//        Circle c3 = new Circle(1, 1, -1);
//        System.out.printf("(%d, %d)\n", c3.center.x, c3.center.y);
//        System.out.println(c3.radius);
//        System.out.println(c3.perimeter());
//        System.out.println(c3.area());
//        System.out.println("--------------------");
//
//    }
}
