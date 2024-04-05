import models.Album;
import models.Musica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema iniciando!");


        Musica musica = new Musica("soul", "Von", "Pop"
                , 123, 2000);

        Musica musica2 = new Musica("Paranoid", "Black Sabbath", "Heavy Metal", 172,
                1970);

        Album novoAlbum = new Album("Paranoid", "Black Sabbath", 1970,
                new ArrayList<Musica>());
        novoAlbum.adicionarMusica(musica);
        novoAlbum.adicionarMusica(musica2);

        System.out.println(novoAlbum);
    }
}
