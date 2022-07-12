import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[8];

        // Print array before copy
        System.out.println("Array before copy: ");
        System.out.println(Arrays.toString(copyTo));

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);

        copyTo[7] = copyTo[4];
        System.out.println("Array after copy: ");
        System.out.println(Arrays.toString(copyTo));


    }

}

