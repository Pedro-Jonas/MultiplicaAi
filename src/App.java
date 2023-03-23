import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("\n" + "Tabela de multiplicação de " + x + "\n");
        System.out.println( 
            x + " x 1 = " + (x*1) + "\n" +
            x + " x 2 = " + (x*2) + "\n" +
            x + " x 3 = " + (x*3) + "\n" +
            x + " x 4 = " + (x*4) + "\n" +
            x + " x 5 = " + (x*5) + "\n" +
            x + " x 6 = " + (x*6) + "\n" +
            x + " x 7 = " + (x*7) + "\n" +
            x + " x 8 = " + (x*8) + "\n" +
            x + " x 9 = " + (x*9) + "\n" +
            x + " x 10 = " + (x*10) + "\n"
        );
        
    }
}
