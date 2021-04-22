package programamedia;

import java.util.Scanner; //Importar objeto entrada de dados

public class ProgramaMedia { //InicioAlgoritmo

    public static void main(String[] args) { //InicioBloco

        Scanner teclado = new Scanner(System.in); //Objeto entrada de dados

        System.out.print("Primeira nota: ");   //Escreva
        float n1 = teclado.nextFloat();        //Leia VAR
        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();

        float m = (n1 + n2) / 2;
        System.out.println("Sua média é: " + m);

        if (m >= 9) { //Se
            System.out.println("Parabéns pequeno gafanhoto!!! ");
        } else { //Senão
            System.out.println("Estude mais :( ");
        }
    } //FimBloco

}//FimAlgoritmo
