import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Song> songs = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i< 2;i++){
            //Scanner input = new Scanner(System.in);
            System.out.println("Please input the artist name: ");
            String artist = input.nextLine();
            //String artist = "Prince";//modify program to prompt user for an artist

            System.out.println("Please input the song title: ");
            String title = input.nextLine();
            //String title = "Purple Rain"; //modify program to prompt user for a title

            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song s: songs){
            System.out.println(s.display());
        }

        //look for blue and print if found
        String titleToFind = "Purple Rain";
        for (Song s: songs){
            if (s.getTitle().equals(titleToFind)){
                System.out.printf("\nI found: %s \r\n",s.display());
            }
        }
    }
}