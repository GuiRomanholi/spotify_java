package models;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private String artista;
    private int anoLancamento;
    private int duracao;
    private List<Musica> musicas = new ArrayList<>();
    public Album(){}

    public Album(String nome, String artista, int anoLancamento, List<Musica> musicas) {
        this.nome = nome;
        this.artista = artista;
        this.setAnoLancamento(anoLancamento);
        this.musicas = musicas;
        calcularDuracao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        if(anoLancamento <= 0){
            System.out.println("O ano de lançamento não pode ser menor ou igual a zero!");
            return;
        }
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {

        this.musicas = musicas;
        for (Musica musica: musicas){
            duracao += musica.getDuracao();
        }
    }
    public void calcularDuracao(){
        for(Musica musica : this.musicas){
            duracao += musica.getDuracao();
        }
    }

    public void adicionarMusica(Musica musica){
        musicas.add(musica);
        duracao +=musica.getDuracao();
    }

    public void removerMusica(Musica musica){
        musicas.remove(musica);
        duracao -= musica.getDuracao();
    }

    @Override
    public String toString() {
        return "Album{nome='%s', artista='%s', anoLancamento=%d, duracao=%d, musicas=%s}"
                .formatted(nome, artista, anoLancamento, duracao, musicas);
    }
}
