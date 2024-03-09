import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float A, B, C;

        System.out.print("Digite 3 valores numéricos: ");
        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();

        sc.nextLine();

        System.out.printf("Triângulo retângulo: %.3f\n", (A * C / 2));
        System.out.printf("Circulo: %.3f\n", (C * C * 3.14159));
        System.out.printf("Trapézio: %.3f\n", ((A + B) / 2.0 + C));
        System.out.printf("Quadrado: %.3f\n", (B * B));
        System.out.printf("Retângulo: %.3f\n", (A * B));


        sc.close();
    }
}
