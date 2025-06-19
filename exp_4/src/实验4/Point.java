package 实验4;

public class Point extends 实验2.Point {

    public Point() {
        super();
    }

    public Point(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "("+this.getX()+", "+this.getY()+")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof 实验2.Point) { // 因为实验4.Point是实验2.Point的子类，所以只需判断一个
            实验2.Point p = (实验2.Point)obj;
            return p.getX()==this.getX() && p.getY()==this.getY();
        } else {
            return false;
        }
    }
}
