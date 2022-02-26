package lab05q2;

public class Cirlce extends Shape{

    public Cirlce(double dim1, double dim2){
        super(dim1, dim2);
    }

    public double area(){
        double area = this.getPI() * this.getDim1() * this.getDim2();
        System.out.println("Inside Area for Circle");
        return area;
    }  
}