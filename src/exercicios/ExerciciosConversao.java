package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosConversao {

    public static void main(String[] args) {

        //Scanner ira receber as informações em String. Independente se haja . ou , o valor numérico.

        Locale.setDefault(new Locale("en", "US"));

        Scanner salario = new Scanner(System.in);
        System.out.println("digite o primeiro salario");
        String salario1 = salario.next();
        System.out.println("digite o segundo salario");
        String salario2 = salario.next();
        System.out.println("digite o terceiro salario");
        String salario3 = salario.next();

        //Convertendo String para Double e usando replace para transformar , em . para que não ocorra erros na divisão.


        double num1 = Double.parseDouble(salario1.replace (",","."));
        double num2 = Double.parseDouble(salario2.replace (",","."));
        double num3 = Double.parseDouble(salario3.replace (",","."));

        double media = num1 + num2 + num3;
        double resultado = media/3;

        System.out.println(resultado);

    }
}
