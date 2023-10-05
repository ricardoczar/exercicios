package exercicios;

import java.util.Scanner;

public class ExerciciosConversao {

    public static void main(String[] args) {

        //Scanner ira receber as informações em String. Independente se haja . ou , o valor numérico.

        Scanner salario = new Scanner(System.in);
        System.out.println("digite o primeiro salario");
        String salario1 = salario.next().replace (",",".");
        System.out.println("digite o segundo salario");
        String salario2 = salario.next().replace (",",".");
        System.out.println("digite o terceiro salario");
        String salario3 = salario.next().replace (",",".");

        //Convertendo String para Double e usando replace para transformar , em . para que não ocorra erros na divisão.


        double num1 = Double.parseDouble(salario1);
        double num2 = Double.parseDouble(salario2);
        double num3 = Double.parseDouble(salario3);

        double media = num1 + num2 + num3;
        double resultado = media/3;

        System.out.println(resultado);

    }
}
