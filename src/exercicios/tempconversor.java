package exercicios;

public class tempconversor{
    public static void main(String[] args) {
    //MINHA SOLUÇÃO DO EXERCICIO
        //int Fahreinheit=104;
        //int Celcius;
        
        //Fahreinheit = Fahreinheit-32;
        //Celcius = Fahreinheit*5/9;
    //System.out.println(Celcius);
    //Celcius/5=Celcius*9=Celcius+32=Fahreinheit;
    
        final double Fator = 5.0/9.0;
        final double ajuste = 32;
        double Fahreinheit = 104;
        double Celcius = (Fahreinheit-ajuste)*Fator;
        System.out.println(Fahreinheit);
        
    }
    
    
}