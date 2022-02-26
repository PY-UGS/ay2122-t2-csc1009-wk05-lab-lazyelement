package lab05q2;

public class Square extends Shape {

    public Square(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area(){
        double area = this.getDim1() * this.getDim2();
        System.out.println("Inside Area for Square");
        return area;
    }
    
}
