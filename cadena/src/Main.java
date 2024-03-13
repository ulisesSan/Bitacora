import java.lang.*;

public class Main {
    public static void main(String[] args) {
        String cadena = "Cadena$67 XFa33^@$%";

        System.out.println(cadena.replaceAll("[^\\dA-Za-z]",""));
    }
}