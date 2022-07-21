import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Movie name");
        String m1=s1.next();
        System.out.println("Enter Song Name");
        String m2=s1.next();
        System.out.println("Enter Movie name");
        String m3=s1.next();
        System.out.println("Enter Song Name");
        String m4=s1.next();
        System.out.println("Enter Movie name");
        String m5=s1.next();
        System.out.println("Enter Song Name");
        String m6=s1.next();
        System.out.println("Enter Movie name");
        String m7=s1.next();
        System.out.println("Enter Song Name");
        String m8=s1.next();
      Song s0=new Song(m1 ,m2);
        Song s2=new Song(m3 ,m4);
       Song s3=new Song(m5 ,m6);
        Song s4=new Song(m7 ,m8);
        PlayList p=new PlayList();

       p.addSong(s0);

        p.addSong(s2);

       p.addSong(s3);

       p.addSong(s4);


//        System.out.println(s1.equals(s2));
        for(Song s:p.lhs){
       s.Play();


        }

    }
}
