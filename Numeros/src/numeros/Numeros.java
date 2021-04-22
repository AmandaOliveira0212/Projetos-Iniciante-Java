package numeros;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //objeto
        int n, soma = 0;
        String resp;

        do { // do = faça
            System.out.println("Digite um numero: ");
            n = teclado.nextInt(); //entrada teclado

            soma += n; // soma = soma + n ==== soma o primeiro nume mais demais numeros

            System.out.println("QUER CONTINUAR? [SIM/NAO]");
            resp = teclado.next(); //ler entrada

        } while (resp.equals("SIM")); // while = enquanto.... a resp for igual a Sim continua.
        System.out.println("A soma de todos os valores:" + soma);
    }
}
