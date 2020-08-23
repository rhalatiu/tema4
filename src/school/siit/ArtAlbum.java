package school.siit;

public class ArtAlbum extends Book {

    private String paperQuality;

    public ArtAlbum(String paperQuality){
        this.paperQuality = paperQuality;
    }

    @Override
    public String getBookName() {
        return super.getBookName();
    }

    @Override
    public Integer getNumberOfPages() {
        return super.getNumberOfPages();
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