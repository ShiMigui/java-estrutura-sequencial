import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.print("Número 1: ");
        n1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Número 2: ");
        n2 = sc.nextInt();

        System.out.println("Soma = " + (n1 + n2));

        sc.close();
    }
}
