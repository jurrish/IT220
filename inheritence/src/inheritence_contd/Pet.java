package inheritence_contd;

public class Pet extends Animal
{
    private String name;
    private boolean hasCollar;

    public void feed()
    {
        System.out.println("My name is: " + name);
    }
}
