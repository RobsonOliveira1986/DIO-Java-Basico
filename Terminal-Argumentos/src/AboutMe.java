import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main (String [] args) {

        /* Modo Padrão
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);*/
        
        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.print("Digite sua iidade");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.print("Meu nome é " + nome + " " + sobrenome + " ");
        System.out.print("Tenho " + idade + " anos e ");
        System.out.print("Minha altura é " + altura + "cm.");
    }
    
}
