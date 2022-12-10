import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");        
        int numero = teclado.nextInt();
        teclado.close();
        System.out.println("\n\nO número digitado foi: " + numero);
    }
}

