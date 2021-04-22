package programapernasescolha;

import java.util.Scanner;

public class ProgramaPernasEscolha {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas? ");

        String tipo;
        int perna = teclado.nextInt();
        System.out.print("Isso é um(a): ");

        //switch serve apenas para numeros inteiros
        switch (perna) { //escolha
            case 1: //caso
                tipo = "Saci";
                break; //pare
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default: //outro caso, que nao está descrito.
                tipo = "ET"; // não precisa do break pelo fato de ser ultimo caso.
        }
        System.out.println(tipo);
    }

}
