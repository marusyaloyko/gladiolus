package Balls;

public class TestBall {
    public static void main(String[] args) {
        Ball m;
        m=new Ball(3,6.5);
        System.out.println(m.toString());
        m.move(6,6);
        System.out.println(m.getY());
        m.setXY(4,4);
    }
}
