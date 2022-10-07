package Point;

public class Point {
    private double x=0;
    private double y=0;

    Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    Point(){};

    public double getX(){
        return this.x;
    }
    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x,double y ){
        this.x=x;
        this.y=y;
    }

    public String toString() {
        return "X "+x+"\nY "+y;
    }
}

