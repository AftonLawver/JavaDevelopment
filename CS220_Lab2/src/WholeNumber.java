import java.lang.Math;

public class WholeNumber {
    private int value;

    public WholeNumber(){
        this.value = 0;
    }

    public WholeNumber(int number){
        this.value = number;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int number) {
        this.value = number;

    }
    public boolean isPrime() {
        for(int i = 2; i < 9; i++) {
            if(this.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isEven() {
        if(this.value % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isOdd() {
        if(this.value % 2 == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public int getSquaredValue() {
        return this.value * this.value;
    }

    public double getSquareRootValue() {
        return Math.sqrt(this.value);
    }

    public boolean isDivisibleByInput(int input) {
        if(this.value % input == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean equalsInput(int input) {
        if(input == this.value) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isPerfectSquare() {
        if (Math.sqrt(this.value) % 1 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
