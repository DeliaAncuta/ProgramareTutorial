package Tema;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Tema4 {

    @Test
    public void metodaTest(){


        /*String[] artistiAlbume = new String[6];

        artistiAlbume[0] = "Michael Jackson";
        artistiAlbume[1] = "Pink Floyd";
        artistiAlbume[2] = "AC/DC";
        artistiAlbume[3] = "Guns N' Roses";
        artistiAlbume[4] = "Nirvana";
        artistiAlbume[5] = "Led Zeppelin";*/


        List<String> artistiAlbume = new ArrayList<>();
        artistiAlbume.add("Michael Jackson"); //0
        artistiAlbume.add("Pink Floyd");
        artistiAlbume.add("AC/DC");
        artistiAlbume.add("Guns N' Roses");
        artistiAlbume.add("Nirvana");
        artistiAlbume.add("Led Zeppelin"); //5

        List<String> denumireAlbume = new ArrayList<>();
        denumireAlbume.add("Thriller"); //0
        denumireAlbume.add("The Dark Side of the Moon");
        denumireAlbume.add("Back in Black");
        denumireAlbume.add("Appetite for Destruction");
        denumireAlbume.add("Nevermind");
        denumireAlbume.add("Led Zeppelin IV"); //5


        //Am definit obiectele
        Album albumUnu = new Album(3, denumireAlbume, artistiAlbume, 1982, 10, 110, "Pop/R&B/Rock");
        albumUnu.InfoAlbumSelectat();

        Album albumDoi = new Album(2, denumireAlbume, artistiAlbume, 200, Boolean.TRUE, Boolean.FALSE, Boolean.TRUE);
        //albumDoi.AddAlbum();

        Album albumTrei = new Album(1, denumireAlbume, "Pop/R&B/Rock", artistiAlbume, 1982, 99, Boolean.TRUE);
        //albumTrei.albumAutograf();

    }

}
