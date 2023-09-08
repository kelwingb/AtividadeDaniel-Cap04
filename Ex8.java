import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso, pesoGramas;

        System.out.println("Informe seu peso: ");
        peso = entrada.nextDouble();
        
        pesoGramas = peso * 1000;

        System.out.println("Seu peso em gramas: " + pesoGramas + "g.");
        entrada.close();
    }
}
