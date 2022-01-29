
/**
 * An interface that describes the operations of a bag of objects.
 * @author Afton Lawver
 */

public interface BagInterface<T> {


    /**
     * Gets the current number of entries in this bag.
     * @return The integer number of entries currently in the bag
     */
    int getCurrentSize();

    /**
     * Sees whether this bag is full.
     * @return True if the bag is full, or false if not.
     */
    boolean isFull();

    /**
     * Sees whether this bag is empty.
     * @return True if the bag is empty, or false if not.
     */
    boolean isEmpty();

    /**
     * Adds a new entry to this bag.
     * @param input The object to be added as a new entry.
     * @return True if the addition is successful, or false if not.
     */
    boolean add(T input);

    /**
     * Removes one unspecified entry from this bag, if possible.
     * @return Either the removed entry, if the removal was successful, or null.
     */
    T removeRandom();

    /**
     * Removes one occurrence of a given entry from this bag, if possible.
     * @param input The entry to be removed.
     * @return True if the removal was successful, or false if not.
     */
    boolean removeSpecific(T input);

    /**
     * Removes all entries from this bag.
     */
    void removeAll();

    /**
     * Counts the number of times a given entry appears in this bag.
     * @param input The entry to be counted.
     * @return The number of times input appears in the bag.
     */
    int getCountOf(T input);

    /**
     * Tests whether this bag contains a given entry.
     * @param input The input to find.
     * @return True if the bag contains input, or false if not.
     */
    boolean contains(T input);
}

