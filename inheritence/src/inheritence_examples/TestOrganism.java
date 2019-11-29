package inheritence_examples;

public class TestOrganism
{
    public static void main(String[] args)
    {
        Organism myOrganism = new Organism(10);
        //test out parent class
        System.out.println(myOrganism);
        myOrganism.makeSound("...");

        //test out child classes
        //will inherit from Organism
        Person bob = new Person("Bob Smith", 30);
        System.out.println(bob);
        bob.makeSound("hello everyone");

        //will inherit from Organism
        Animal susy = new Animal("Bear", 10);
        System.out.println(susy);

        //will inherit from Animal
        Cat furrBall = new Cat("British short hair",true, 5);
        System.out.println(furrBall);

        Beaver chewy = new Beaver(30.5, 5);
        System.out.println(chewy);

        //this technique is called upcasting
        //restricts everything to right of equal sign to Organism's methods
        //we dont have access to child methods

        Organism[] organisms = {myOrganism, bob, susy, furrBall};

        for (int i = 0; i < organisms.length; i++)
        {
            System.out.println("toString: " + organisms[i].getAge());
        }
    }
}
