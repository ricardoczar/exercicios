package exercicios;

public class PrimitivosVsObjetos {

    public static void main(String[] args) {

        String s = new String("texto");
        s = s.toUpperCase();
        System.out.println(s);
    }
}
