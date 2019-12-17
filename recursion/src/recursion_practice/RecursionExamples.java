package recursion_practice;

public class RecursionExamples
{
    public static void main(String[] args)
    {
        //recursion is an alternative to loops
//        countTo(10); //10, 9, 8, 7, ... 1( base case)
//        printArray(new String[]{"hello", "world", "how", "are", "you","?"}, 0);

        System.out.println("factorial(0): " + factorial(0));
        System.out.println("factorial(1): " + factorial(1));
        System.out.println("factorial(2): " + factorial(2));
        System.out.println("factorial(3): " + factorial(3));
        System.out.println("factorial(4): " + factorial(4));
        System.out.println("factorial(5): " + factorial(5));

        System.out.println("fibonacci(0): " + fibonacci(0));
        System.out.println("fibonacci(1): " + fibonacci(1));
        System.out.println("fib(2): " + fibonacci(2));
        System.out.println("fib(3): " + fibonacci(3));
        System.out.println("fib(4): " + fibonacci(4));
        System.out.println("fib(5): " + fibonacci(5));
    }

    public static int fibonacci(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }

        int first = fibonacci(n-1);
        int second = fibonacci(n-2);
        return first + second;
    }

    //recursive method with a return type [calculate factorials]
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }

        int result = n * factorial(n-1);
        return result;
    }

    //print the numbers from n down to 1
    public static void countTo(int n)
    {
        //base case
        if(n < 1)
        {
            return; //stop recursing
        }

        //print n
        System.out.println(n);

        //recurse
        countTo(n - 1); //by decreasing here, we are approaching our base case
    }

    //given an array ["hello","world", "how", "are", "you", "?"]
    //this method will print out "Hello world how are you?"
    public static void printArray(String[] words, int index)
    {
        if(index < 0 || index >= words.length)
        {
            return; //stop if given bad index
        }

        //what is your base case?
        if(index == words.length)
        {
            System.out.println();//print a new line character
            return;
        }

        //print out the current word
        System.out.print(words[index] + " ");

        //recurse and approach base case
        printArray(words, index+1);
    }
}
