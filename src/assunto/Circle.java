package assunto;

import java.awt.*;

public class Circle {


    Point center;
    private double radius;
    private static int numberOfCircles;

    Circle() {
        numberOfCircles++;
    }
    Circle(Point center, double radius) {
        numberOfCircles++;
        this.center = center;
        this.radius = radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    void setCenter(Point center) {
        this.center = center;
    }

    void  setRadius(double radius) {
        this.radius = (radius >= 0) ? radius : 0;
    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }

    public double getRadius() {
        return radius;
    }


}






























