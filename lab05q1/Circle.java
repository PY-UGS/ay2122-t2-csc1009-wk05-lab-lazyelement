import java.lang.Math;

public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * this.radius * this.radius;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    }

    public double getDiameter(){
        double diameter = 2 * this.radius;
        return diameter;
    }

    public void printCircle(){
        System.out.println("This circle has a radius of "+ this.radius + ". \nArea: " + 
            this.getArea() + "\nDiameter: " + this.getDiameter() + 
            "\nPerimeter: " + this.getPerimeter());
    }
}
