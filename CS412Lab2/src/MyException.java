// Afton Lawver
// siu851463587

class MyException extends Exception {
    private String exceptionMessage;

    public MyException() {
        this.exceptionMessage = "This message is invalid.";
    }

    MyException(String str) {
        super(str);
    }


}