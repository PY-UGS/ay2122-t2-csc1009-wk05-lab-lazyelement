package lab05q2;

public class Rectangle extends Shape {

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area(){
        double area =  this.getDim1() * this.getDim2();
        System.out.println("Inside Area for Rectangle");
        return area;
    }
}
