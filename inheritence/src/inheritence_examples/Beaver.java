package inheritence_examples;

public class Beaver extends Animal
{
    private double swimSpeed;

    public Beaver(double swimSpeed, int age)
    {
        super("beaver", 5);
        this.swimSpeed = swimSpeed;
    }

    public double getSwimSpeed()
    {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed)
    {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public String toString()
    {
        return "Beaver{" +
                "swimSpeed=" + swimSpeed +
                '}' + ", " + super.toString();
    }
}
