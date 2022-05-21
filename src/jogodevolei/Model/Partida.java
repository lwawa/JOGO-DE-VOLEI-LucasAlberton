package jogodevolei.Model;

public class Partida {
    private Equipe   equipeA, equipeB;
    private String   hora;
    private int[][]  sets;
    private int      setAtual;
    
    public Partida(Equipe A, Equipe B, String h){
        equipeA = A;
        equipeB = B;
        hora = h;
        sets = new int[5][3];
        setAtual = 1;
    }

    public Equipe getEquipeA() {
        return equipeA;
    }

    public void setEquipeA(Equipe equipeA) {
        this.equipeA = equipeA;
    }

    public Equipe getEquipeB() {
        return equipeB;
    }

    public void setEquipeB(Equipe equipeB) {
        this.equipeB = equipeB;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int[][] getSets() {
        return sets;
    }

    public int getSetAtual() {
        return setAtual;
    }
    
    public void terminaSet(){
        sets[setAtual-1][0] = equipeA.getPontuacao();
        sets[setAtual-1][1] = equipeB.getPontuacao();
        if(sets[setAtual-1][0] > sets[setAtual-1][1]){
            equipeA.ganhaSet();
            sets[setAtual-1][2] = 1;
        }else{
            equipeB.ganhaSet();
            sets[setAtual-1][2] = 2;
        }
        setAtual++;
    }
    
    public String getVencedor(int setNumero){
        switch (sets[setNumero-1][2]) {
            case 1:
                return equipeA.getNome();
            case 2:
                return equipeB.getNome();
            default:
                return "<vazio>";
        }
    }
    
    public void darPonto(boolean equipe){
        if(equipe)
            equipeA.ganhaPonto();
        else
            equipeB.ganhaPonto();
    }
    
    public void tiraPonto(boolean equipe){
        if(equipe)
            equipeA.ganhaPonto();
        else
            equipeB.ganhaPonto();
    }
}
