package models;

public class Musica {
    private String nome;
    private String artista;
    private String genero;
    private int duracao;
    private int anoLancamento;
    //contrutor com retorno
    public Musica(String nome, String artista, String genero, int duracao, int anoLancamento) {
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.duracao = duracao;
        this.setAnoLancamento(anoLancamento);
    }

    //construtor sem retorno
    public Musica(){}

    //getter e setters

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if(duracao <= 0){
            System.out.println("A duração da música não pode ser menor que zero!");
            return;
        }
        this.duracao = duracao;
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

    //Métodos
    public void tocar(){
        System.out.println("Tocando a música " + this.nome);
    }

    public void curtir(){
        System.out.println("Curtindo a música " + this.nome);
    }
    public void pausar(){
        System.out.println("Pausando a música " + this.nome);
    }

    @Override
    public String toString() {
        return "models.Musica{nome='%s', artista='%s', genero='%s', duracao=%d, anoLancamento=%d}"
                .formatted(nome, artista, genero, duracao, anoLancamento);
    }
}
