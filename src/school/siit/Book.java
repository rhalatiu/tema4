package school.siit;

public class Book {
    private String bookName;
    private Integer bookPages;
    private String bookType;

/**
    public void addBook(){

    }

    public void removeBook(){

    }
*/
    public Book (String name, int pages, String type){
        bookName = name;
        bookPages = pages;
        bookType = type;
    }


    public void setName(String name) {
        this.bookName = name;
    }

    public void setPages(Integer pages) {
        this.bookType = pages;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookPages=" + bookPages +
                ", bookType='" + bookType + '\'' +
                '}';
    }
}
