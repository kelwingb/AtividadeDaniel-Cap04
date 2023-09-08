import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Coloque o valor da base maior do trapézio: ");
        double baseMaior = entrada.nextDouble();

        System.out.print("Coloque o valor da base menor do trapézio: ");
        double baseMenor = entrada.nextDouble();

        System.out.print("Coloque o valor da altura do trapézio: ");
        double altura = entrada.nextDouble();

        double area = ((baseMaior + baseMenor) * altura) / 2;
        // Concatenação
        System.out.println("A área do trapézio é: " + area);

        entrada.close();
    }
}
