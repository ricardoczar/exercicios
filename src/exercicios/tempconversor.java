package exercicios;
    import  java.util.Scanner;
public class tempconversor{
    public static void main(String[] args) {
    //MINHA SOLUÇÃO DO EXERCICIO
        //int Fahreinheit=104;
        //int Celcius;
        
        //Fahreinheit = Fahreinheit-32;
        //Celcius = Fahreinheit*5/9;
    //System.out.println(Celcius);
    //Celcius/5=Celcius*9=Celcius+32=Fahreinheit;

        Scanner entrada = new Scanner(System.in);
        System.out.println("CONVERSOR DE TEMPERATURA");
        System.out.println("Digite o valor em Fahreinheit");
        double Fahreinheit = entrada.nextInt();
        final double Fator = 5.0/9.0;
        final double ajuste = 32;
        double Celcius = (Fahreinheit-ajuste)*Fator;

        System.out.println("A temperatura em Celcius é " + Celcius + " Graus");
        entrada.close();
        //final double Fator = 5.0/9.0;
        // final double ajuste = 32;
       //double Fahreinheit;
       // double Celcius = (Fahreinheit-ajuste)*Fator;
       // System.out.println(Celcius);

    }
    
    
}