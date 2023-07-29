import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
       double temperatura = 30.4;
       double temperaturaFahrenheit = ((temperatura *1.8) + 32);

        System.out.println(temperaturaFahrenheit);

        int temperaturaFahreinheitInteira = (int) temperaturaFahrenheit;

        System.out.println(temperaturaFahreinheitInteira);

    }
}