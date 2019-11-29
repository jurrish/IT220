package inheritence_contd;

public class Pet extends Animal
{
    private String name;
    private boolean hasCollar;

    public Pet(double weight, String type, String name, boolean hasCollar) {
        super(weight, type);
        this.name = name;
        this.hasCollar = hasCollar;
    }

    public void feed()
    {
        System.out.println("My name is: " + name);
    }
}
