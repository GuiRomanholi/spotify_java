package models;

public class Artista extends Usuario {
    private String nome;
    private String genero;
    private int anoNascimento;

    public Artista(String nome, String genero, int anoNascimento) {
        this.nome = nome;
        this.genero = genero;
        this.anoNascimento = anoNascimento;
    }

    public Artista(String login, String senha, String nome, String genero, int anoNascimento) {
        super(login, senha);
        this.nome = nome;
        this.genero = genero;
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", anoNascimento=" + anoNascimento +
                "} " + super.toString();
    }
}
