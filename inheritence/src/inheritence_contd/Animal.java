package inheritence_contd;

public class Animal
{
    //"double weight" with no visibility mod allows all files in package to view/access fields
    private double weight;
    //"protected" allows child access to parent fields
    private String type;

    public Animal(double weight, String type)
    {
        this.weight = weight;
        this.type = type;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "Animal{" +
                "weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
