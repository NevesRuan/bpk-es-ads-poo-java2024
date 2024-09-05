package exercicio14;

public class Time {
    private String nome;
    private String tecnico;
    private Integer numeroDeJogadores;

    public Time(String nome, String tecnico, Integer numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public Integer getNumeroDeJogadores() {
        return numeroDeJogadores;
    }

    public void adicionarJogador() {
        numeroDeJogadores++;
    }

    public void removerJogador() {
        if (numeroDeJogadores > 0) {
            numeroDeJogadores--;
        } else {
            System.out.println("Não há jogadores para remover.");
        }
    }
}
