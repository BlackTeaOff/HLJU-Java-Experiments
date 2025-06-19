package 实验3;

import 实验2.Point;
import 实验2.Circle;

public class ColoredCircle extends Circle {
    Color borderColor;
    Color centerColor;

    public ColoredCircle() {
        Circle c = new Circle();
        borderColor = new Color();
        centerColor = new Color();
    }

    public ColoredCircle(Point center, int radius) {
        super(center, radius); // 调用父级构造器，否则不传入参数
        Circle c = new Circle(center, radius);
        borderColor = new Color();
        centerColor = new Color();
    }

    public ColoredCircle(Color centerColor, Color borderColor) {
        Circle c = new Circle();
        if (centerColor == null) {
            centerColor = new Color(0, 0, 0);
        }
        if (borderColor == null) {
            borderColor = new Color(0, 0, 0);
        }
        this.borderColor = borderColor;
        this.centerColor = centerColor;
    }

    public ColoredCircle(Point center, int radius, Color centerColor, Color borderColor) {
        super(center, radius);
        Circle c = new Circle(center, radius);
        if (centerColor == null) {
            centerColor = new Color(0, 0, 0);
        }
        if (borderColor == null) {
            borderColor = new Color(0, 0, 0);
        }
        this.centerColor = centerColor;
        this.borderColor = borderColor;
    }

    void setCenterColor(Color c) {
        if (c != null) {
            centerColor = c;
        }
    }
    void setBorderColor(Color c) {
        if (c != null) {
            borderColor = c;
        }
    }

    Color getCenterColor() {
        return centerColor;
    }
    Color getBorderColor() {
        return borderColor;
    }

    @Override
    public int relation(Circle c) { // 传入另一个圆
//        double d = center.distance(c.center);
//        int r1 = radius;
//        int r2 = c.radius;

        if (!(c instanceof ColoredCircle)) {
            if (super.relation(c) == 0) {
                return 1;
            } else {
                return super.relation(c);
            }
        }

        if (super.relation(c) == 0) { // 同一圆，判断颜色
            if (centerColor.getRed() == ((ColoredCircle) c).centerColor.getRed() && centerColor.getBlue() == ((ColoredCircle) c).centerColor.getBlue()
            && centerColor.getGreen() == ((ColoredCircle) c).centerColor.getGreen() && borderColor.getRed() == ((ColoredCircle) c).borderColor.getRed()
            && borderColor.getBlue() == ((ColoredCircle) c).borderColor.getBlue() && borderColor.getGreen() == ((ColoredCircle) c).borderColor.getGreen()) { // 传进来的圆可能不是ColoredCircle
                return 0;
            } else { // 颜色不同，变成同心圆
                return 1;
            }
        }
        return super.relation(c);

//        if (d == 0 && r1 == r2) { // 同一
//            return 0;
//        }
//        if (d == 0) { // 同心
//            return 1;
//        }
//        if (d < r1 + r2 && d > Math.abs(r1 - r2)) { // 相交，但不内含(因为内含也满足这个)
//            return 2;
//        }
//        if (d >= r1 + r2) { // 相离
//            return 3;
//        }
//        if (d < Math.abs(r1 - r2)) { // 内含
//            return 4;
//        }
//        return 5;
    }
}
