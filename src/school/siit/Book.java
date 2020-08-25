package school.siit;

public class Book {

    private String bookName;
    private Integer numberOfPages;

    public Book(){}

    public Book(String bookName, Integer numberOfPages) {
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
    }

    protected Integer getNumberOfPages() {
        return this.numberOfPages;
    }

    protected String getBookName() {
        return this.bookName;
    }
}