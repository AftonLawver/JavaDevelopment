/**
 * @author Afton Lawver
 * Pairs of objects whose data types are the same class type.
 * If each pair is itself an object, we can define an interface
 * to describe the behavior of such pairs and use a generic
 * type in its definition. A pairable object contains two
 * objects of the same generic type T.
 * @param <T> Class type of the data.
 */

public interface Pairable<T>
{
    public T getFirst();
    public T getSecond();
    public void changeOrder();
    // end Pairable
}
