/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author amand
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vet[] = {3, 6, 1, 9, 4, 2}; //vetores
        Arrays.sort(vet); // mostra o vetor em ordem crescente

        for (int valor : vet) { // o valor do vetor ira mostrar na tela
            System.out.println(valor);
        }
        int posicao = Arrays.binarySearch(vet, 4); // encontra o valor 4 dentro dos vetores
        System.out.println("Encontrei o valor na posição: " + posicao);
    }

}
