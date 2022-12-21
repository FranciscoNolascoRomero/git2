

import java.util.Scanner;

public class TestMatematicas {

    public static void main(String[] args) {
        System.out.printf("INTRODUCE UN NUMERO");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        Matematicas.espar(numero);
        Matematicas.esDivisiblePorCinco(numero);
        Matematicas.esDivisiblePorTres(numero);
    }
}
