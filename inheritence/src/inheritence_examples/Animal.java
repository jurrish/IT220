package inheritence_examples;

public class Animal extends Organism
{
    //fields
    private String type; //raccoon, moose. bear, cat

    //constructors
    public Animal(String type, int age)
    {
        super(age);
        this.type = type;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String toString()
    {
        /*
            Rule #4: If you don't declare a parent class
            then Object automatically becomes parent class
         */
        return "(info from Animal Class) Type: " + type + ", " + super.toString();
    }
}
