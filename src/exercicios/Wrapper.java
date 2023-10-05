package exercicios;

public class Wrapper {

    public static void main(String[] args) {

        //byte
        Byte b =10;
        Short s =1000;
        //Interger
        Integer i =Integer.parseInt("1");
        Long l = 10000L;
        System.out.println(i);
        System.out.println(l.byteValue());

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c ='#';
        System.out.println(c);
    }
}
