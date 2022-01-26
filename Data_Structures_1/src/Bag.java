package src;

public class Bag<T> implements BagInterface<T> {

    public static void main(String[] args) {

    }

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
