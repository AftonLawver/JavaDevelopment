public class TextBook {

    private String title;
    private String author;
    private String publisher;

    public TextBook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public TextBook(TextBook textbookObject) {
        this.title = textbookObject.title;
        this.author = textbookObject.author;
        this.publisher = textbookObject.publisher;
    }

    public void set(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String toString() {

        return "Title: " + this.title + "\n" +
                "Author: " + this.author + "\n" +
                "Publisher: " + this.publisher + "\n";
    }

}
