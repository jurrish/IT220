package shapes;

public class Square extends Rectangle
{
    //dont need attributes. can use parent class
    public Square(double side)
    {
        super(side, side);
    }

    public String toString()
    {
        return "Square [side=" + getWidth() + "]";
    }
}
