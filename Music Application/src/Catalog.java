import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Catalog {
    List<Song> songs;

    public Catalog() {
        this.songs = new ArrayList<>();
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public void addSongsToCatalog(Song song){
        this.songs.add(song);
    }

    public List<Song> filterSong(String artist, String genre, Year year, Album album){
        return this.songs.stream()
                .filter(song -> (artist == null || song.getArtist().equals(artist)) &&
                        (genre == null || song.getGenre().equals(genre)) &&
                        (year == null || song.getYear().equals(year)) &&
                        (album == null || song.getAlbum().equals(album)))
                .collect(Collectors.toList());
    }
}
