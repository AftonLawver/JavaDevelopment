
import java.util.Arrays;
import java.util.Random;

public class Bag<T> implements BagInterface<T> {

    private static final int DEFAULT_CAPACITY = 100;
    private T[] bagElements;
    private int numberOfElements = 0;

    public Bag(int capacity) {
        @SuppressWarnings("unchecked")
        T[] tempBag = (T[]) new Object[capacity];
        bagElements = tempBag;
    }

    public Bag() {
        this(DEFAULT_CAPACITY);
    }

    private int getIndexOf(T input) {
        int location = -1;
        for (int i = 0; i < numberOfElements; i++) {
            if (input.equals(bagElements[i])) {
                location = i;
                break;
            }
        }
        return location;
    }

    private void removeAtIndex(int index)
    {
        numberOfElements--;
        bagElements[index] = bagElements[numberOfElements]; // A little confusing
        bagElements[numberOfElements] = null;
    }

    public int getCurrentSize()
    {
        return numberOfElements;
    }

    public boolean isFull()
    {
        if(numberOfElements == bagElements.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isEmpty()
    {
        if(numberOfElements == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean add(T input)
    {
        if(isFull())
        {
            return false;
        }
        else
        {
            bagElements[numberOfElements] = input;
            numberOfElements++;
            return true;
        }
    }

    public T removeRandom()
    {
        Random randomNumber = new Random();
        int elementToRemove = randomNumber.nextInt(numberOfElements-1);
        T removedElement = bagElements[elementToRemove];
        removeAtIndex(elementToRemove);
        return removedElement;
    }

    public boolean removeSpecific(T input)
    {
        if(isEmpty())
        {
            return false;
        }
        else {
            int index = getIndexOf(input);
            removeAtIndex(index);
            return true;
        }
    }

    public void removeAll()
    {
        for(int i=0; i<numberOfElements; i++)
        {
            bagElements[i] = null;
        }
        numberOfElements = 0;
    }

    public int getCountOf(T input)
    {
        int count = 0;

        for(int i=0; i<numberOfElements; i++)
        {
            if(input.equals(bagElements[i]))
            {
                count++;
            }
        }
        return count;
    }

    public boolean contains(T input)
    {
        if(getCountOf(input) > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void doubleBagSize()
    {
        bagElements = Arrays.copyOf(bagElements, 2 * bagElements.length);
    }
}
