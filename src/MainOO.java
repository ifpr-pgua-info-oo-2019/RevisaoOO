import java.util.Scanner;

public class MainOO {

    public static void main(String[] args) {

        int MAX_JOGADAS=3;
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        int leitura;
        int jogada = 0;

        //declaração
        JogadorHumano jogador;
        JogadorComputador computador;
        Juiz juiz;

        //instanciar
        jogador = new JogadorHumano("Hugo",MAX_JOGADAS);
        computador = new JogadorComputador(MAX_JOGADAS);
        juiz = new Juiz();

        while(continuar && jogada < MAX_JOGADAS){

            System.out.println("Par ou Impar? (1-Par 0-Impar)");
            leitura = scan.nextInt();
            if(leitura != 1 && leitura != 0){
                System.out.println("Opção Inválida!!");
                System.exit(1);
            }

            jogador.setEhPar(leitura==1);

            System.out.println("Digite um valor entre 0 e 10:");
            leitura = scan.nextInt();

            if(leitura < 0 || leitura > 10){
                System.out.println("Valor inválido!!");
                System.exit(1);
            }

            jogador.registraJogada(leitura,jogada);

            computador.registraJogada(jogada);

            String resultado = juiz.verificaQuemGanhou(jogador,computador);

            System.out.println("J:"+jogador.getValorAtual()+" C:"+computador.getValorAtual());
            System.out.println(resultado);

            System.out.println("Quer continuar? (1-Sim 0-Não)");
            continuar = scan.nextInt()==1;
            jogada += 1;
        }

        int[] escolhasJogador= jogador.getEscolhas();
        int[] escolhasComputador = computador.getEscolhas();

        for(int i=0;i<jogada;i++){
            System.out.println("J:"+escolhasJogador[i]+" C:"+escolhasComputador[i]);
        }




    }

}
