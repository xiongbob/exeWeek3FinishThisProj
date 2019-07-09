public class Song {
    private String artist;
    private String title;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /*
    public String add(Song s) {
        return title;

    }
    */

    public String display(){
        return "\n" + "Artist name: " + getArtist() +
                "\n" + "Song title: " + getTitle();
    }
}
