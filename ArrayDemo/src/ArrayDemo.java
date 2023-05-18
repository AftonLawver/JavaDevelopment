import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] anArray;            // declares an array of integers

        anArray = new int[10];    // allocates memory for 10 integers

        anArray[0] = 100; // initialize first element
        anArray[1] = 200; // initialize second element
        anArray[2] = 300; // etc.
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
        System.out.println("Element at index 5: " + anArray[5]);
        System.out.println("Element at index 6: " + anArray[6]);
        System.out.println("Element at index 7: " + anArray[7]);
        System.out.println("Element at index 8: " + anArray[8]);
        System.out.println("Element at index 9: " + anArray[9]);



            // Arrays always have a fixed length
            // ArrayLists allow us to add and remove elements

            // Create an Array
            String[] namesArray = {"Bob", "Dylan", "Chris", "Jack"};

            // Create an ArrayList
            ArrayList<String> namesArrayList = new ArrayList<>(Arrays.asList("Bob", "Dylan", "Chris", "Jack"));

            // Get value from the Array
            System.out.println(namesArray[2]);

            // Get value from the ArrayList
            System.out.println(namesArrayList.get(2));

            // Get the size of the Array
            System.out.println(namesArray.length);

            // Get the size of the ArrayList
            System.out.println(namesArrayList.size());

            // Cannot add an element to an Array
            // Add an element to the ArrayList
            namesArrayList.add("Mark");

            // Set an element in the Array
            namesArray[0] = "Carl";

            // Set an element in the ArrayList
            namesArrayList.set(0, "Carl");
            namesArrayList.set(0, "Carl");

            // Remove an element in an ArrayList
            namesArrayList.remove("Chris");

            // Print out all of the elements
            for (String name : namesArray) {
                System.out.println(name);
            }
            System.out.println(namesArrayList);


        }
    }

