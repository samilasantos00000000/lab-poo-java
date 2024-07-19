package lab02;

public class volumeCubo2 {

    public static void main(String[] args) {
        System.out.println("informe o lado");
        var sc = new Scanner(System.in);
        var lado = sc.nextInt();

        var volume = Math.pow(lado, b:3);

        System.out.println("o volume do cubo é: " + volume);

        sc.close();
    }
}