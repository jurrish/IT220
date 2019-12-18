package examples;

import java.util.ArrayList;

public class UsingJavasArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //add()
        for (int i = 100; i < 1100; i+= 100)
        {
            numbers.add(i);
        }
        System.out.println(numbers.toString());

        //size related methods
        System.out.println("size(): " + numbers.size()); //number of elemeents
        System.out.println("isEmpty(): " + numbers.isEmpty()); //

        //loop and remove all eleements from the internal array
        numbers.clear();
        System.out.println("isEmpty(): " + numbers.isEmpty());
        System.out.println(numbers.toString());

        //add(index) - insert operation
        for (int i = 1; i <= 100; i++) {
            //causes shifting - BAD!!
            numbers.add(0, i);
        }
        System.out.println(numbers.toString());

        //remove by index
        numbers.remove(new Integer(100));
        System.out.println(numbers.toString());

        numbers.remove(3);
        System.out.println(numbers.toString());

        //get() and set()
        System.out.println(numbers.get(0)); //akin to square bracket notation with arrays
        System.out.println(numbers.set(0, 10000));
        System.out.println(numbers.toString());

        //contains()
        System.out.println("contains(10000): " + numbers.contains(10000));
        System.out.println("Contains(20000?): " + numbers.contains(20000));

        //loop over an array list (not like an array) - use SIZE and GET
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.print(numbers.get(i) + ", ");
        }
        //new line
        System.out.println();

        //enhanced for loop (for-each) loop
        //"for each int element in numbers array"
        for(int element : numbers) //auto-unboxing
        {
            System.out.print(element + ", ");
        }
        System.out.println(); //new line

        //be sure to be careful when interacting with operations
        //in the array class (avoid shifting)
        numbers.clear();
        System.out.println("start work");
        for (int i = 0; i < 1000000; i++)
        {
            //shifting gets worse over time!
//            numbers.add(0, i);//insert elements in reverse order - lots of shifting

            numbers.add(i);
        }
        System.out.println("end work");

    }
}
