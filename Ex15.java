import java.util.Scanner;

public class  Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque o valor do salário de João: ");
        double salario = scanner.nextDouble();

        System.out.print("Coloque o valor da primeira conta atrasada: ");
        double conta1 = scanner.nextDouble();
        double multa1 = conta1 * 1.02;

        System.out.print("Coloque o valor da segunda conta atrasada: ");
        double conta2 = scanner.nextDouble();
        double multa2 = conta2 * 1.02;

        double totalMulta = multa1 + multa2;
        double saldoRestante = salario - totalMulta;

        System.out.println("O valor total das multas é: " + totalMulta);
        System.out.println("O saldo restante após pagar as multas é: " + saldoRestante);

        scanner.close();
    }
}
