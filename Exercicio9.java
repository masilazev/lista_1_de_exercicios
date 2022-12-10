import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Temperatura em Fahrenheit: ");
        double temp_fahrenheit = teclado.nextDouble();
        teclado.close();

        //Requisito 2: Transforme em graus celsius
        double temp_celsius = 5 * ((temp_fahrenheit - 32) / 9);
        System.out.print("\nA temperatura em Fahrenheit " + temp_fahrenheit + " convertida para graus celsius é = " + temp_celsius + "\n");
    }
}
