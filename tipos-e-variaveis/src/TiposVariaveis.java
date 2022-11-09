public class TiposVariaveis {
    public static void main(String[] args) {
        byte idade = 26;
        short ano = 2022;
        int cep = 8370800; //se começar em zero talvez não reconheça
        long cpf = 99999999999L; //se começar em zero talvez não reconheça, sempre colocar L no final
        float pi = 3.14F; //sempre colocar F no final
        double salario = 2500.67;

        int numero = 5;

        numero = 10;

        System.out.print(numero);

        //double VALOR_DE_PI = 3.14;
        //VALOR_DE_PI = 5;  //SEM FINAL DEIXA ALTERAR

        final double VALOR_DE_PI = 3.14;
    }
}
