import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
          Scanner teclado = new Scanner(System.in);
            System.out.print("Quanto você ganha por hora? ");
            double sal_hora = teclado.nextDouble();
    
            System.out.print("Quantas horas trabalhou? ");
            double hora_trab = teclado.nextDouble();
            teclado.close();
    
            double salario_mes = sal_hora * hora_trab;
            System.out.println("O salário mensal é = " + salario_mes);
    }
}
