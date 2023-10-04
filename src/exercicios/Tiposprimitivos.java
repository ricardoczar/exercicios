package exercicios;

import java.net.StandardSocketOptions;

public class Tiposprimitivos {
    public static void main(String[] args) {

        //tipos primitivos de armazenamento de informações
        byte anosDeEmpresa =23;
        short numeroDeVoos =5422;
        int id=568792;
        long pontosAcomulados=3_233_34444L;

        //tipos numericos. a letra F identifica o valor literal para o tipo float e não double
        float salario = 11_445.44F;
        double vendasAcumuladas= 2;

        //tipo booleano
        boolean estaDeFerias = true;

        //tipo caractere
        char status= 'a';

        String s="testando X 123";
        s=s.replace("X","senhora");
        s=s.toUpperCase();
        s=s.concat("!<>");
        System.out.println(s);
    }
}
