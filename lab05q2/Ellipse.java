package lab05q2;

public class Ellipse extends Shape {

    public Ellipse (double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area(){
        double area =  this.getDim1() * this.getDim2() * this.getPI();
        System.out.println("Inside Area for Ellipse");
        return area;
    }
}

