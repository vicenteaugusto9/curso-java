import java.util.Locale;

public class Main {

    public static void  main(String[] args) {

        System.out.println("hello World");

        String nome = "vicente Augusto Gomes De Paulo";
        int idade = 20;
        double altura = 1.77;
        char sexo = 'M';

        System.out.printf("%s tem %d anos e tem %.2f de altura e seu sexo  e %c", nome,idade,altura,sexo);


        String product1 = "computer";
        String product2 = "oficce desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';


        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;
        Locale.setDefault(Locale.US);
        System.out.printf(" %n products: %s which price is %.2f%n",product1,price1);


    }
}