// Afton Lawver
// 851463587

import java.util.Arrays;
import java.util.Random;

public class MergeSortArraySeq implements Runnable{
    private int[] a;
    private int level;
    public MergeSortArraySeq(int[] a, int level) {
        this.a = a;
        this.level = level;
    }
    public void run() {
        parallelMergeSort(a, level);
    }

    public static int[] initializeArray(int numberOfElements) {
        int[] myArray = new int[numberOfElements];
        Random rand = new Random();
        for (int i = 0; i < numberOfElements; i++) {
            int int_random = rand.nextInt(numberOfElements);
            myArray[i] = int_random;
        }
        return myArray;
    }

    public static void printArray(int[] myArray) {
        for(int i = 0; i < myArray.length-1; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static void mergeSort(int[] a) {
        if (a.length >= 2) {
            // split array in half
            int[] left  = Arrays.copyOfRange(a, 0, a.length / 2);
            int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
            mergeSort(left);
            mergeSort(right);
            merge(left, right, a);
        }
    }

    public static void merge(int[] left, int[] right, int[] a) {
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] < right[i2])) {
                a[i] = left[i1];
                i1++;
            } else {
                a[i] = right[i2];
                i2++;
            }
        }
    }

    public static void parallelMergeSort(int[] a) {
        parallelMergeSort(a, 3);
    }

    private static void parallelMergeSort(int[] a, int threadCount) {
        if (threadCount <= 1) {
            mergeSort(a);
        } else if (a.length >= 2) {
            int[] left  = Arrays.copyOfRange(a, 0, a.length / 2);
            int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);

            Thread lThread = new Thread(new MergeSortArraySeq(left,  threadCount / 2));
            Thread rThread = new Thread(new MergeSortArraySeq(right, threadCount / 2));
            lThread.start();
            rThread.start();

            try {
                lThread.join();
                rThread.join();
            } catch (InterruptedException ie) {}

            merge(left, right, a);
        }
    }

    public static void main( String args[]) {
        int numberOfElements = 100000;
        int[] newArray = initializeArray(numberOfElements);

        long start = System.currentTimeMillis();
        mergeSort(newArray);
        long end = System.currentTimeMillis();
        System.out.println("Total time for sequential sort for " + numberOfElements +
                 " elements: " + (end - start) + "ms");

        int[] newArray2 = initializeArray(numberOfElements);
        long start2 = System.currentTimeMillis();
        parallelMergeSort(newArray2, 20);
        long end2 = System.currentTimeMillis();

        System.out.println("Total time for parallel merge sort for " + numberOfElements + " elements using 20 threads: " + (end2 - start2) + "ms");
    }
}
