import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qt;
        float vl, vl_total;

        System.out.print("Produto 1: ");
        sc.nextInt(); // Código
        qt = sc.nextInt(); // Quantidade
        vl = sc.nextFloat(); // Valor do produto

        vl_total = vl * qt;

        sc.nextLine();

        System.out.print("Produto 2: ");
        sc.nextInt(); // Código
        qt = sc.nextInt(); // Quantidade
        vl = sc.nextFloat(); // Valor do produto
        vl_total = vl * qt + vl_total;

        System.out.printf("Valor a pagar: R$ %.2f", vl_total);

        sc.close();
    }
}
