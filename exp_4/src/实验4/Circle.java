package 实验4;

public class Circle extends 实验2.Circle{
    Circle() {
        super(new Point(), 0); // 在实验四里面创建的Point，有实验四Point里面的toString
    }

    Circle(Point c, int r) {
        super(c, r);
    }

    Circle(实验2.Point c, int r) {
        super(c, r);
    }

    Circle(int x, int y, int r) {
        super(new Point(x, y), r); // 否则把参数传给父级构造器，在实验二的包里创建Point(没有重写的toString)
    }

    @Override
    public String toString() {
        return this.getCenter().toString()+", "+this.getRadius();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof 实验2.Circle) {
            实验2.Circle c = (实验2.Circle)obj;
            return this.getCenter().getX() == c.getCenter().getX() && this.getCenter().getY() == c.getCenter().getY() && this.getRadius() == c.getRadius();
        } else {
            return false;
        }
    }
}
