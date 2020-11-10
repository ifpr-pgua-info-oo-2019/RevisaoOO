import java.util.Scanner;
import java.util.Random;


/**
 * possiveis entidades:
 *    - jogador humano
 *    - jogador computador
 *    - juiz
 *
 */

public class Main {

    public static int opcaoComputador(){
        Random rnd = new Random(System.currentTimeMillis());

        int valor = rnd.nextInt(11);

        return valor;
    }

    public static String verificaQuemGanhou(boolean usuarioPar, int valorUsuario, int valorComp){

        int soma = valorUsuario + valorComp;

        if((soma % 2 == 0) && usuarioPar){
            return "Usuário";
        }else if((soma % 2 == 1) && !usuarioPar){
            return "Usuário";
        }

        return "Computador";
    }


    public static void main(String[] args) {

        int MAX_JOGADAS = 3;

        Scanner scan = new Scanner(System.in);

        boolean usuarioPar = false;
        int valorUsuario = 0;
        boolean continuar=true;
        int jogada = 0;

        int[] escolhasUsuario;
        int[] escolhasComputador;

        escolhasUsuario = new int[MAX_JOGADAS];
        escolhasComputador = new int[MAX_JOGADAS];

        while(continuar && jogada < MAX_JOGADAS) {
            System.out.println("Você quer ser par? (1 - Sim 0 - Não)");
            int res = scan.nextInt();

            if (res == 1) {
                usuarioPar = true;
            } else if (res == 0) {
                usuarioPar = false;
            } else {
                System.out.println("Opção inválida!!");
                System.exit(1);
            }

            System.out.println("Escolha um número de 0 a 10:");
            valorUsuario = scan.nextInt();

            if (valorUsuario < 0 || valorUsuario > 10) {
                System.out.println("Valor inválido!!");
                System.exit(1);
            }

            int opComp = opcaoComputador();

            String ganhador = verificaQuemGanhou(usuarioPar, valorUsuario, opComp);

            escolhasUsuario[jogada] = valorUsuario;
            escolhasComputador[jogada] = opComp;

            jogada+=1;
            System.out.println(ganhador);

            System.out.println("Você quer continuar?(1 - Sim 0 - Não)");
            continuar = scan.nextInt() == 1;
        }


        for(int i=0;i<escolhasUsuario.length;i++){
            System.out.println("J:"+escolhasUsuario[i]+" C:"+escolhasComputador[i]);
        }

    }


}
