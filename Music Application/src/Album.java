import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Album {
    private static int counterId = 0;
    private int albumId;
    private List<Song> songs;
    private String albumName;
    private double price;

    public Album(String albumName, double price) {
        this.albumId = ++counterId;
        this.albumName = albumName;
        this.songs = new ArrayList<>();
        this.price = price;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addSongs(Song song){
        if(song.getAlbum().getAlbumId() == this.albumId){
            this.songs.add(song);
        }
    }
}
