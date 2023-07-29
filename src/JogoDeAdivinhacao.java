import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroRandomico = new Random().nextInt(100);
        int tentativas = 5;

        System.out.println(
                """
                Escolha uma Dificuldade:
                {Facil}, {normal}, {hard}
                """);
        String dificuldade = scanner.nextLine();
        System.out.println("Escolhido: "+dificuldade);
        if(dificuldade.equals("facil")){
            numeroRandomico = new Random().nextInt(13);
            System.out.println("Tente adivinhar um numero de 1 a 13");
        }else if(dificuldade.equals("normal")){
            numeroRandomico = new Random().nextInt(50);
            System.out.println("Tente adivinhar um numero de 1 a 50");
        }else if(dificuldade.equals("hard")){
            numeroRandomico = new Random().nextInt(99);
            System.out.println("Tente adivinhar um numero de 1 a 99");
        }

        System.out.println("A resposta é aleatorio:");

        System.out.println("================================");
        while(true){

            System.out.println("Você possuí: " +tentativas+" tentativas");
            System.out.println("================================");

            int resposta = scanner.nextInt();

            if(numeroRandomico == resposta){
                System.out.println("Acertou!");
                System.out.println("A resposta é: "+numeroRandomico);
                break;
            }else{
                System.out.println("Errou!");
                tentativas--;
            }
            if(tentativas == 0){
                System.out.println("Perdeu!");
                break;
            }


            System.out.println("================================");
        }
        System.out.println("=============[Jogo Encerrado!]=============");
    }
}
