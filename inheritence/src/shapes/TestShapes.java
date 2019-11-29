package shapes;

public class TestShapes
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle(10,20);
        Square square = new Square(15);
        RightTriangle triangle = new RightTriangle(4,3);

        //using upcasting(polymorphism)
        //variables can take dynamic shape and functionality
        //toString is being called in different contexts from diff locations
        Shape[] shapes = {rect, square, triangle};

        for (int i = 0; i < shapes.length; i++)
        {
            System.out.println(shapes[i].toString());
            //.area can be called bc ancestor (Shape) has an abstract method and is an abstract
            //class
            System.out.println(shapes[i].area());
        }
    }
}
