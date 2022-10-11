//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas
// no mês. Calcule e mostre o total do seu salário no referido mês.

package ex_8;

import java.util.Scanner;

public class ex_8 {
    public static void main(String[] args) {
        float salarioHora = 0;
        float horasMes = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora trabalhada? ");
        salarioHora = sc1.nextFloat();
        System.out.println("Quantas horas você trabalhou este mês? ");
        horasMes = sc1.nextFloat();
        float salarioMes = salarioHora * horasMes;
        System.out.println("Se salário neste mês é de: R$" + salarioMes);
    }
}
