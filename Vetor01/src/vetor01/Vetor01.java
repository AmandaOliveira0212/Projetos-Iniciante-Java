package vetor01;

/**
 *
 * @author amand
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int n[] = new int[4];   OU

        int n[] = {3, 2, 8, 7, 5, 4}; // vetores onde ficam valores agrupados
        System.out.println("O total de casas é: " + n.length);// total de vetores dentro de n lenth = comprimento

        for (int c = 0; c <= 5; c++) { // começa contando em 0 até 5
            System.out.println("Na posição: " + c + " temos o valor: " + n[c]); // n valores e [c] contador

        }
    }

}
