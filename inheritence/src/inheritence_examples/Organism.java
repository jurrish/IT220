package inheritence_examples;

public class Organism
{
    //fields
    private int age;

    //constructors

    /*
     *  Rule #1: if you write a class and dont provide a constructor, a
     *  default constructor is provided for you (automatically)
    */

    public Organism(int age)
    {
        this.age = age;
    }

    //methods(getters, setters, toString() other methods..)
    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String toString()
    {
        return " (toString info from Organism class) Age: " + age;
    }

    public void makeSound(String sound)
    {
        System.out.println(sound);
    }
}
