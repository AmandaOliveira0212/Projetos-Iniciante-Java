package vetor03;

import java.util.Arrays; //importação para colocar em ordem

public class Vetor03 {

    public static void main(String[] args) {

        double v[] = {3, 5, 2.75, 9, -4.5};
        Arrays.sort(v); // coloca o vetor em ordem crescente
        for (double valor : v) { // for it proprio para vetores, para cada elemente de v coloque dentro da variavel valor 
            System.out.print(valor + " ");
        }
    }

}
