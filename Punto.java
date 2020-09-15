import java.lang.Math;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double n) {
        this.x = n;
    }

    public void setY(double n) {
        this.y = n;
    }

    public static double distancia(Punto p1, Punto p2) {
        return Math.sqrt((Math.pow(p1.y - p2.y, 2) + Math.pow(p1.x - p2.x, 2)));
    }
}