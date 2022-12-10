import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o Raio do Cícrulo: ");
        double raio = teclado.nextDouble();
        teclado.close();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo de raio " + raio + " é = " + area);
    }
}
