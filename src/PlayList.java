import java.util.*;

public class PlayList {
    public List<Song> songs = new ArrayList<>();
    LinkedHashSet<Song> lhs=new LinkedHashSet<>();
    public void addSong(Song song){
//        StringBuilder sb=new StringBuilder("");
//
//        char[] chr= original.toCharArray();


        if(lhs.add(song)){
            System.out.println("Song added to playlist");

        }
        else{
            System.out.println("Song Already added");
        }













    }
    }


