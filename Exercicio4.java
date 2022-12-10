import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nota do 1 bimestre: ");
        double n1 = teclado.nextDouble();

        System.out.print("Nota do 2 bimestre: ");
        double n2 = teclado.nextDouble();
   
         System.out.print("Nota do 3 bimestre: ");
         double n3 = teclado.nextDouble();
 
        System.out.print("Nota do 4 bimestre: ");
        double n4 = teclado.nextDouble();

        teclado.close();
    
        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.print("A média é = " + media);
    }
}
