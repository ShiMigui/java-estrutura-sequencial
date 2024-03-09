import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float PI = 3.14159f;
        float r;

        System.out.print("Raio: ");
        r = sc.nextFloat();
        System.out.printf("A = %.4f", (r * r * PI));

        sc.close();
    }
}
