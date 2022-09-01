public class Book {
    private String bookName;
    private String author;
    private long isbnNumber;
    private  double price;

    public Book(String bookName, String author, long isbnNumber, double price) {
        this.bookName = bookName;
        this.author = author;
        this.isbnNumber = isbnNumber;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(long isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", isbnNumber=" + isbnNumber +
                ", price=" + price +
                '}';
    }
}
