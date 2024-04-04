import models.Musica;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema iniciando!");

        Musica novaMusica = new Musica();
        novaMusica.setNome("It's my Life");
        novaMusica.setArtista("Bon Jovi");
        novaMusica.setGenero("Rock");
        novaMusica.setDuracao(279);
        novaMusica.setAnoLancamento(1960);

        Musica musica = new Musica("soul", "Von", "Pop"
                , 123, 2000);

    }
}
