package shapes;

public abstract class Shape
{
    private String name;

    public Shape(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    //abstract methods only exist to be overridden by children
    //ie- square, rectangle, right triangle all have distinct area() methods
    public abstract double area();

    @Override
    public String toString()
    {
        return "Square{" +
                "name='" + name + '\'' +
                '}';
    }
}
