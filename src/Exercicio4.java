import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float vl_hora;
        int qt_hora, cd_funcionario;

        System.out.print("Código do funcionário: ");
        cd_funcionario = sc.nextInt();

        sc.nextLine();

        System.out.print("Horas trabalhadas: ");
        qt_hora = sc.nextInt();

        sc.nextLine();

        System.out.print("Valor da hora: ");
        vl_hora = sc.nextFloat();

        sc.nextLine();

        System.out.println("Funcionário: " + cd_funcionario);
        System.out.printf("Salário = R$ %.2f", (vl_hora * qt_hora));

        sc.close();
    }
}
