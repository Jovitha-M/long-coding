import java.util.ArrayList;
import java.util.List;

public class User {
    private static int counterId = 0;
    private int userId;
    private Account account;
    private String userName;
    private List<Playlist> playlists;

    public User(Account account, String userName) {
        this.userId = ++counterId;
        this.account = account;
        this.userName = userName;
        this.playlists = new ArrayList<>();
        account.addUser(this);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    public void createPlaylist(String playlistName){
        Playlist userPlaylist = new Playlist(this, playlistName);
        playlists.add(userPlaylist);
    }

    public void addSongToPlaylist(Playlist playlist, Song song){
        if(this.playlists.contains(playlist))
            playlist.addSongs(song);
    }
}