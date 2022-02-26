package lab05q2;

public class Triangle extends Shape {

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area(){
        double area =  1/2 * this.getDim1() * this.getDim2();
        System.out.println("Inside Area for Triangle");
        return area;
    }

}
