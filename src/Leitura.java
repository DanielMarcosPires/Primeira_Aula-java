import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = scanner.nextLine();
        double avaliacao = scanner.nextDouble();
        System.out.println(avaliacao);
    }
}
