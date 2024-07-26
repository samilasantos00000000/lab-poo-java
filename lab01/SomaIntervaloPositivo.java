import java.util.Scanner;

public class SomaIntervaloPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Recebe os dois números inteiros do usuário
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();
        
        // Determina o intervalo mínimo e máximo
        int inicio = Math.min(numero1, numero2);
        int fim = Math.max(numero1, numero2);
        
        // Calcula a soma dos números positivos no intervalo
        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            if (i > 0) { // Considera apenas números positivos
                soma += i;
            }
        }
        
        // Exibe o resultado
        System.out.println("A soma dos números positivos no intervalo é: " + soma);
        
        scanner.close();
    }
}