import java.util.Objects;

public class Song {
    private  String movieName;
    private  String songName;

    public Song() {

    }

    @Override
    public boolean equals(Object obj) {
        Song s1=this;
        Song s2=(Song)obj;
        return s1.songName.equals(s2.songName) && s1.movieName.equals(s2.movieName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, songName);
    }

    public Song(String movieName, String songName) {
        this.movieName = movieName;
        this.songName = songName;
    }
    public void Play(){
        System.out.println(songName+" of "+movieName+" is playing...!");
    }
}
