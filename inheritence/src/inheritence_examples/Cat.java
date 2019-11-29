package inheritence_examples;

public class Cat extends Animal
{
    //fields
    private String breed;
    private boolean diva;

    //constructors
    public Cat(String breed, boolean diva, int age)
    {
        //pass in cat as the type since it's inerited from Animal so
        // you dont have to type "cat" as an argument when instantiating
        //every Cat object
        super("cat", age);
        this.breed = breed;
        this.diva = diva;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public boolean isDiva()
    {
        return diva;
    }

    public void setDiva(boolean diva)
    {
        this.diva = diva;
    }

    public String toString()
    {
        return "Cat: " + breed + "(diva?): " + diva + " " + super.toString();
    }
}
