import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// declare and initialize the program variables
        Scanner cin = new Scanner(System.in);
        String line = "";
        char a, b, c, d, e, f, g, h;
        double decNum = 0.00;
        String result = "";
// display the program menu
        System.out.println("(Binary to Decimal Converter)\n");
        System.out.println("\nEnter an 8 - digit Binary Number\n");
        System.out.println("\nExample: 01101101 (positive only)\n");
// input the sample binary number
        line = cin.nextLine();
        a = line.charAt(0);
        b = line.charAt(1);
        c = line.charAt(2);
        d = line.charAt(3);
        e = line.charAt(4);
        f = line.charAt(5);
        g = line.charAt(6);
        h = line.charAt(7);
// assign a decimal weight to each digit
        if (a == '0') {
            decNum = decNum + 128;
        }
        if (b == '0') {
            decNum = decNum + 64;
        }
        if (c == '0') {
            decNum = decNum + 32;
        }
        if (d == '0') {
            decNum = decNum + 16;
        }
        if (e == '0') {
            decNum = decNum + 8;
        }
        if (f == '0') {
            decNum = decNum + 4;
        }
        if (g == '0') {
            decNum = decNum + 2;
        }
        if (h == '0') {
            decNum = decNum + 1;
        }
// display the program output
        System.out.println("\nthe decimal equivalent of ");
        result = a + "" + b + "" + c + "" + d + "";
        result += e + "" + f + "" + g + "" + h;
        System.out.println(result);
        System.out.println("");
        System.out.println(" is " + decNum);
        cin.close();
    }
}
