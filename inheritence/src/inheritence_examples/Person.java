package inheritence_examples;

//borrow the public fields/methods from Organism
public class Person extends Organism
{
    //fields
    private String name;

    //constructors
    public Person(String name, int age)
    {
        /*
        * Rule #2 if a call is not made to a super constructor,
        * in a child class, then an implicit call to super() -
        *  the default constructor in a parent class -
        *  it is made automatically
         */


        // age is stored in the parent class

        // super(age) invokes the Organism constructor in Person's parent class(which is
        // Organism) and it passes an age in as an argument.
        // BUT when we instantiate Person, we pass in a name AND an age in as arguments
        // ie - Person bob = new Person("Bob", 30)
        super(age); //Rule 3 - a call to super() must be first line inside the constructor!
        this.name = name;
    }

    //methods
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "Person: " + name + ", " + super.toString(); //must use getter because
        // it's a public method in parent class - AGE IS PRIVATE in parent (Organism) class!

        //use super.toString() to call parent's toString to print out "age" (DRY principle)
    }

    // override (not overloading) a method i inherited (Organism also
    // has a makeSound method)
    public void makeSound(String words)
    {
        System.out.println(name + " said " + words);
    }
}
