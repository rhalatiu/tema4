package school.siit;

public class ArtAlbum extends Book {

    private String paperQuality;

    public void ArtAlbum(String paperQuality) {
        getBookName();
        getNumberOfPages();
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }
    /**
    private String paperQuality; //albums have paper quality

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }
     */
}