import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void  main(String[] args) {



        Scanner sc = new Scanner(System.in);
          String name;
          int age;
          char s;
          name = sc.next();
          age = sc.nextInt();
          s = sc.next().charAt(0);

          System.out.println("Dados recebidos");
          System.out.println("Nome: " + name);
          System.out.println("Idade " + age);
          System.out.println("Sexo " + s);



        sc.close();
    }
}