package generics;

//T is a placeholder for the types we will store in our class
//you can restrict the type ex:
//T extends DigitalCar
public class DataStorage<T>
{
    //field
    private T data;

    //constructor
    public DataStorage(T data)
    {
        this.data = data;
    }

    //methods
    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
