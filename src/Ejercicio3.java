import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {
    public static void main(String[] args) {
        String frase = "Això és un exercici senzill de Java.";

        Pattern patron = Pattern.compile("[A-Za-zÀ-ÿ]+");
        Matcher coinc = patron.matcher(frase);

        int contar = 0;

        while (coinc.find()) {
            contar++;
        }

        System.out.println("La frase té " + contar + " paraules.");
    }
}
