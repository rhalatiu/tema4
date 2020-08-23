package school.siit;

public class Album extends Book {
    private String paperQuality;

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    /**
    public Album(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }
    */
}
