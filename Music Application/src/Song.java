import java.time.Year;

public class Song {
    private static int counterId = 0;
    private int songId;
    private String songName;
    private String artist;
    private Album album;
    private Year year;
    private String genre;
    private Catalog catalog;

    public Song(String songName, String artist, Album album, Year year, String genre) {
        this.songId = ++counterId;
        this.songName = songName;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.genre = genre;
        album.addSongs(this);
        catalog.addSongsToCatalog(this);
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
