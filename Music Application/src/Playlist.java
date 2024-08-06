import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Playlist {
    private static int counterId = 0;
    private int playlistId;
    private User user;
    private String playlistName;
    private Stack<Song> songs;

    public Playlist(User user, String playlistName) {
        this.playlistId = ++counterId;
        this.user = user;
        this.playlistName = playlistName;
        this.songs = new Stack<>();
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public Stack<Song> getSongs() {
        return songs;
    }

    public void setSongs(Stack<Song> songs) {
        this.songs = songs;
    }

    public void addSongs(Song song){
        this.songs.add(song);
    }
}

