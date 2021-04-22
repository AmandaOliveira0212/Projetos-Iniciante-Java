package vetor05;

import java.util.Arrays;

public class Vetor05 {

    public static void main(String[] args) {
        int v[] = new int[20]; // cria 20 posicoes 
        Arrays.fill(v, 4); // coloca o 4 detro das 20 posicoes

        for (int valor : v) { //cria variavel valor e acrescenta o vetor
            System.out.print(valor + " "); // saida dos numeros
        }

    }

}
