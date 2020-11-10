public class JogadorHumano extends Jogador{

    //atributos
    private String apelido;


    //metodos

    public JogadorHumano(String apelido,int max_jogadas){
        super(max_jogadas);
        this.apelido = apelido;
    }

    public void registraJogada(int valorAtual, int jogada){
        this.valorAtual = valorAtual;
        this.escolhas[jogada] = valorAtual;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

}
