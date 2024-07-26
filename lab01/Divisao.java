package lab02;
import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print( "Digite um número ");
        var numero = scanner.nextInt();
       
       
        System.out.println("A quantidade de Divisao de " + numero + " é " + contarDivisao(numero) + ".");
       
        scanner.close();
    }

    public static int contarDivisao(int n) {
        var quantidadeDivisao = 0;
       
   
        for (int i = 1; i <= n; i++) {
       
            if (n % i == 0) {
                quantidadeDivisao++;
            }
        }
       
        return quantidadeDivisao;
    }
}