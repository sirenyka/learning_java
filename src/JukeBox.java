import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class JukeBox {
    //обобщение <String>, так как он
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new JukeBox().go();
    }

    public void go() {
        //запуск программы и печать результата.
        getSongs();
//        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        //создаем множество, куда добавляем отсортированный список песен.
        HashSet<Song> songSet = new HashSet<Song>();
        songSet.addAll(songList);
        System.out.println("множество: " + songSet);

        ArtistComparator artistComparator = new ArtistComparator();
        Collections.sort(songList, artistComparator);
//        System.out.println(songList);

    }
    void getSongs() {
        //считать песни из текстового файла
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse) {
        //добавляем песню со всеми параметрами в список songList
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
    }