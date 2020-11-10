public class Juiz {

    public String verificaQuemGanhou(JogadorHumano jogador, JogadorComputador computador){

        int soma = jogador.getValorAtual() + computador.getValorAtual();
        String res="";


        if(jogador.isEhPar() && soma % 2 == 0){
            return res = "Jogador";

        }else if(!jogador.isEhPar() && soma % 2 == 1){
            return res = "Jogador";
        }

        res = "Computador";

        return res;

    }


}
