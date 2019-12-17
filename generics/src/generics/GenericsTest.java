package generics;

public class GenericsTest
{
    public static void main(String[] args)
    {

        IntegerStorage number = new IntegerStorage(100);

        //retrieve or assign number
        System.out.println("Value: " + number.getData());
        number.setData(200);
        System.out.println("Value: " + number.getData());

        StringStorage string = new StringStorage("Hello world");
        System.out.println("value: " + string.getData());

        //ObjectStorage can store any type of object or primitive
        //primitives: byte, short, int, long, float, double, boolean, char
        //primitives are mapped to a wrapper class
        //byte - Byte, short - Short, int - Integer, long - Long
        //boolean - Boolean
        //char - Character
        ObjectStorage object1 = new ObjectStorage("Hello");
        System.out.println(object1.getData().toString());

        ObjectStorage object2 = new ObjectStorage(new DigitalCar());
        System.out.println(object2.getData().toString());

        //auto-boxing and unboxing
        ObjectStorage object3 = new ObjectStorage(100);
        System.out.println(object3.getData().toString());

        //what if i wanted to print a string value all in upperclass that was stored in my ObjectStorage
//        System.out.println(object1.getData().toUpperCase()); //not possible
        //not possible because when the data gets put through the constructor, it is
        //set to type "Object" and Object doesnt have the toUpperCase method
        //so, we have a String object but not the String methods

        //workaround: cast your value back to your original type
        String retrievedString = (String)object1.getData();
        System.out.println(retrievedString.toUpperCase());

        //use Generics to store and retrieve objects
        /*
        the compiler will create a new version of the DataStorage class for each
        generic type that is used. This process of creating compatible classes is
        called Type Erasure
         */
        DataStorage<String> stringValue = new DataStorage<String>("hey");
        DataStorage<Integer> intValue = new DataStorage<Integer>(100);
        DataStorage<DigitalCar> carValue = new DataStorage<DigitalCar>(new DigitalCar());

        //we can retrieve our value using their original types
        System.out.println(stringValue.getData().toUpperCase());

        int number1 = 9;
        int number2 = 7;

        //store the result of division and remainder
        Pair<Integer, Integer> results = new Pair<Integer, Integer>(number1/number2,
                                                                    number1%number2);

        System.out.println("Quotient: " + results.getFirst());
        System.out.println("Remainder: " + results.getSecond());

        Pair<String, Boolean> namesToSkdiving = new Pair<String, Boolean>("JR", false);
    }
}
