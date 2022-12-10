import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o lado do quadrado: ");
        double lado = teclado.nextDouble();
        teclado.close();

        double area = lado * lado;

        double dobro = area * 2;

        System.out.print("\n\nO dobro da área do quadrado é = " + dobro);
    }
}
