/**
 * @author Afton Lawver
 * A class of ordered pairs of objects having the same data type.
 */

public class OrderedPair<T> implements Pairable<T> {
    private T first, second;

    public OrderedPair(T firstItem, T secondItem)
    {
        first = firstItem;
        second = secondItem;
    }

    /** Returns the first object in this pair. */
    public T getFirst()
    {
        return first;
    }

    /** Returns the second object in this pair. */
    public T getSecond()
    {
        return second;
    }

    /** Returns a string representation of this pair. */
    public String toString()
    {
        return "(" + first + ", " + second + ")";
    }

    /** Interchanges the objects in this pair. */
    public void changeOrder()
    {
        T temp = first;
        first = second;
        second = temp;
    }
}
