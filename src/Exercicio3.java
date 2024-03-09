import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int A, B, C, D;

        System.out.println("Escreva 4 números inteiros(positivos ou negativos):");

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        System.out.println("Diferença = " + (A * B - C * D));

        sc.close();
    }
}
