public abstract class Jogador {

    protected boolean ehPar;
    protected int valorAtual;
    protected int[] escolhas;

    public Jogador(int max_jogadas){
        this.escolhas = new int[max_jogadas];
    }


    public boolean isEhPar() {
        return ehPar;
    }

    public void setEhPar(boolean ehPar) {
        this.ehPar = ehPar;
    }

    public int getValorAtual() {
        return valorAtual;
    }


    public int[] getEscolhas() {
        return escolhas;
    }

}
