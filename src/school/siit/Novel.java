package school.siit;

public class Novel extends Book {

    private String bookName, typeOfBook; //like mystery, sf, etc
    private Integer numberOfPages;

    public Novel(){}

    public Novel(String bookName, Integer numberOfPages, String typeOfBook) {
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
        this.typeOfBook = typeOfBook;
    }

    public String getTypeOfBook() {
        return typeOfBook;
    }

    @Override
    protected String getBookName() {
        return super.getBookName();
    }

    @Override
    protected Integer getNumberOfPages() {
        return super.getNumberOfPages();
    }

    Novel novel = new Novel(bookName, numberOfPages, typeOfBook);
}
