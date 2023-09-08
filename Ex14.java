import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int anoAtual, anoNasc, anos, meses, dias, semanas;

        System.out.println("Informe o ano atual: ");
        anoAtual = entrada.nextInt();
        System.out.println("informe o ano nascimento: ");
        anoNasc = entrada.nextInt();

        anos = anoAtual - anoNasc;
        meses = anos * 12;
        dias = anos * 365;
        semanas = anos * 52;

        System.out.println("A idade dessa pessoa em anos: " + anos);
        System.out.println("A idade dessa pessoa em meses: " + meses);
        System.out.println("A idade dessa pessoa em dias: " + dias);
        System.out.println("A idade dessa pessoa em semanas: " + semanas);
        entrada.close();
    }
}
