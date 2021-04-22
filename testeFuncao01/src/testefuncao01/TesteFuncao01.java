package testefuncao01;

public class TesteFuncao01 {

    static int soma(int a, int b) { // static = para main statico // void nao retorna valor // int + return retorna valor
        int s = a + b;
        return s;
    }

    public static void main(String[] args) { //void = procedimento // main = metodo principal
        System.out.println("Começou o programa");
        int sm = soma(5, 2);
        System.out.println("A soma vale " + sm);
    }

}
