public interface BagInterface<T> {
    /**
        An interface that describes the operations of a bag of objects.
        @author Afton Lawver
     */

    /**
     * Gets the current number of entries in this bag.
     * @return The integer number of entries currently in the bag
     */
    public int getCurrentSize();

    /**
     * Sees whether this bag is full.
     * @return True if the bag is full, or false if not.
     */
    public boolean isFull();

    /**
     * Sees whether this bag is empty.
     * @return True if the bag is empty, or false if not.
     */
    public boolean isEmpty();

    /**
     * Adds a new entry to this bag.
     * @param input The object to be added as a new entry.
     * @return True if the addition is successful, or false if not.
     */
    public boolean add(T input);

    /**
     * Removes one unspecified entry from this bag, if possible.
     * @return Either the removed entry, if the removal was successful, or null.
     */
    public T removeRandom();

    /**
     * Removes one occurrence of a given entry from this bag, if possible.
     * @param input The entry to be removed.
     * @return True if the removal was successful, or false if not.
     */
    public boolean removeSpecific(T input);

    /**
     * Removes all entries from this bag.
     */
    public void removeAll();

    /**
     * Counts the number of times a given entry appears in this bag.
     * @param input The entry to be counted.
     * @return The number of times input appears in the bag.
     */
    public int getCountOf(T input);

    /**
     * Tests whether this bag contains a given entry.
     * @param input The input to find.
     * @return True if the bag contains input, or false if not.
     */
    public boolean contains(T input);
}

public class Bag implements BagInterface{

    public static void main(String[] args) {

    }

    public Bag(int capacity)
    {
        @SuppressWarnings("unchecked")
        T[] tempBag = (T[]) new Object[capacity];
        bagElements = tempBag;
    }

    public Bag()
    {
        this(DEFAULT_CAPACITY);
    }

    private int getIndexOf(T input)
    {
        int location = -1;

        for (int i = 0; i < numberOfElements; i++)
        {
            if(input.equals(bagElements[i]))
            {
                location = i;
                break;
            }
        }
        return location;
    }

    @Override
    public int getCurrentSize() {
        return 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean add(Object input) {
        return false;
    }

    @Override
    public Object removeRandom() {
        return null;
    }

    @Override
    public boolean removeSpecific(Object input) {
        return false;
    }

    @Override
    public void removeAll() {

    }

    @Override
    public int getCountOf(Object input) {
        return 0;
    }

    @Override
    public boolean contains(Object input) {
        return false;
    }
}

