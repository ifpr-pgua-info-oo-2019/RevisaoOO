import java.util.Random;

public class JogadorComputador extends Jogador{

    public JogadorComputador(int max_jogadas){
        super(max_jogadas);
    }

    public void registraJogada(int jogada){
        this.sorteia();
        this.escolhas[jogada] = this.valorAtual;
    }

    //métodos
    private void sorteia(){
        Random rnd = new Random(System.currentTimeMillis());

        valorAtual = rnd.nextInt(11);
    }



}
