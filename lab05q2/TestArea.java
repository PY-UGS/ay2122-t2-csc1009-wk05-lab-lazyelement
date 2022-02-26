package lab05q2;

public class TestArea{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Cirlce c = new Cirlce(5, 5);
        Ellipse e = new Ellipse(7, 7);
        Square s = new Square(6, 6);

        Shape figref;   //this is ok, no object is created

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());

        figref = c;
        System.out.println("Area is " + figref.area());

        figref = e;
        System.out.println("Area is " + figref.area());

        figref = s;
        System.out.println("Area is " + figref.area());
    }
}