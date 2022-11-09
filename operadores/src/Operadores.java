public class Operadores {
    public static void main(String[] args) {
        //Operador dde igualdade ou atribuição "="
        //Operadores aritmeticos "+, -, *, /, %"

        //usando + com String ele irá concatenar

        int numero = 5;
        //x repetição

        //numero = numero +1

        numero++;

        System.out.print(numero);

        boolean variavel = true;
         variavel = !variavel; //negando uma variavel booleana

         System.out.print(variavel);

        int a, b;

        a = 5;
        b = 6;
        String resultado = a==b?"verdadeiro" :"falso";
        
        /*if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";*/

        System.out.print(resultado);
    }
}
