import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>();
        songs.add("janeman");
        songs.add("tu pyar he mera");
        songs.add("yo yo");

        for(String s:songs){
            System.out.println(s);
        }
        System.out.println("===========");

        for(int i=0;i< songs.size();i++){
            System.out.println(songs.get(i));
        }

        System.out.println("==========");
        
        Iterator<String> itr=songs.iterator();


        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
