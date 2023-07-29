import java.lang.reflect.Array;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        String InitialMessage = "Welcome";
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================");
        while(true){
            System.out.println(InitialMessage);
            System.out.println("Deseja iniciar a aplicação? (s) ou (n)");
            boolean decision = scanner.nextLine().equals("s");

            if(decision){
                System.out.println("Aplicação iniciado");
                break;
            }else{
                System.out.println("Aplicação finalizado!");
                break;
            }
        }
    }
}
