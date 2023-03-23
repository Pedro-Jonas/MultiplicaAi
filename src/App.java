import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Tabela de multiplicação de " + x);
    }
}
