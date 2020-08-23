package school.siit;

public class Novel extends Book {

    private String typeOfBook; //like mystery, sf, etc

    public void setTypeOfBook(String typeOfBook) {
        this.typeOfBook = typeOfBook;
    }

    public String getTypeOfBook() {
        return typeOfBook;
    }



    /**
    public Novel(String typeOfBook){
        this.typeOfBook = typeOfBook;
    }

    public void setTypeOfBook(String typeOfNovel) {
        this.typeOfBook = typeOfNovel;
    }
     */
}
