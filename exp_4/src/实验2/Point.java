package 实验2;

public class Point {

    private int x; // 不需要在外部访问了，使用内部函数间接访问
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

//    public static void main(String[] args) {
//        Point p1 = new Point();
//        Point p2 = new Point(0, 3);
//
//        System.out.println(p1.getX());
//        System.out.println(p1.getY());
//        System.out.println(p2.getX());
//        System.out.println(p2.getY());
//
//        System.out.println(p1.distance(p2));
//    }
}
