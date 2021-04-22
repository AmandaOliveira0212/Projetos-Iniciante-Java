package funcao01;

public class Fatorial {

    private int num = 0; //calcular fatorial
    private int fat = 1; // resultado fatorial
    private String formula = ""; // formula

    public void setValor(int n) {
        num = n;
        int f = 1;
        String s = "";

        for (int c = n; c > 1; c--) {
            f *= c;
            s += c + " x ";
        }
        s += f;
        fat = f;
        formula = s;
    }

    public int getFatorial() {
        return fat;
    }

    public String getFatormula() {
        return formula;
    }
}
