package jogodevolei.Model;

public class Equipe {
    private String nome;
    private int pontuacao, setsVencidos;

    public Equipe(String n){
        nome=n;
        pontuacao=0;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getSetsVencidos() {
        return setsVencidos;
    }
    
    public String getPontuacaoString(){
        return Integer.toString(pontuacao);
    }
    
    public String getSetsVencidosstring(){
        return Integer.toString(setsVencidos);
    }
    
    public void ganhaPonto(){
        this.pontuacao++;
    }
    
    public void tiraPonto(){
        this.pontuacao--;
    }
    
    public void ganhaSet(){
        this.setsVencidos++;
    }
    
}
