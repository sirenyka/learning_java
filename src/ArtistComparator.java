import java.util.Comparator;

public class ArtistComparator implements Comparator<Song>{
    //класс-сравниватель по имени исполнителя
    @Override
    public int compare(Song one, Song two) {
        //вернуть результат функции сравнения 2х исполнителей.
        return one.getArtist().compareTo(two.getArtist());
    }
}
