package school.siit;

public class ArtAlbum extends Book {

    private String paperQuality, bookName;
    private Integer numberOfPages;

    public ArtAlbum(){}

    public ArtAlbum(String bookName, Integer numberOfPages, String paperQuality){
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    @Override
    protected String getBookName() {
        return super.getBookName();
    }

    @Override
    protected Integer getNumberOfPages() {
        return super.getNumberOfPages();
    }

    ArtAlbum album = new ArtAlbum(bookName, numberOfPages, paperQuality);
}