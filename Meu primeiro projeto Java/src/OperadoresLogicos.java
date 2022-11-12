public class OperadoresLogicos {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.print("b1 && b2" + (b1 && b2));
        System.out.print("b1 && b3" + (b1 && b3));

        System.out.print("b2 || b3" + (b2 || b3));
        System.out.print("b2 || b4" + (b2 || b4));

        System.out.print("b1 && b3" + (b1 && b3));
        System.out.print("b4 && b1" + (b4 && b1));

        System.out.print(!b1);
        System.out.print(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;


    } 
    
}
