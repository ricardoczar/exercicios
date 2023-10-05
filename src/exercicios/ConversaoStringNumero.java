package exercicios;

import javax.swing.JOptionPane;
import java.math.BigDecimal;


public class ConversaoStringNumero {

    public static void main(String[] args) {

        String valor1= JOptionPane.showInputDialog("digite o primeiro valor");

        String valor2= JOptionPane.showInputDialog("digite o segundo valor");

        String resultado = valor1+valor2;

        //convertendo string para numeros
        Double Numero1= Double.parseDouble(valor1);
        Double Numero2= Double.parseDouble(valor2);

        Double soma = Numero1+Numero2;

        System.out.println(BigDecimal.valueOf(soma));





    }
}
