package testefuncao02;

public class Operacoes { // classe Operações onde fica a operação dde contagem

    public static String contador(int i, int f) { //metodo retorna uma string //public = a Classe TesteFunção pode utilizar
        String s = ""; // declarando a variavel vazia

        for (int c = i; c <= f; c++) { //conta do inicio ao fim dos valores de 1,5 da classe main
            s += c + " "; //retorna string = s + c + espaço em branco
        }
        return s; // retorna uma string
    }
}
