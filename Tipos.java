package MainPrimitivos.TIPOS;

public class Tipos {


    public static void main(String[] args) {


//        int age = (int) 20.755;
//        float salarioFloat = (float) 2300.05;
//        double salarioDouble = (float) 25000.05;
//        short numero = (short) 500.450;
//        byte number = (char) 127.98;
//        boolean verdadeiro = true;
//        char caractere = 66;


        int age = 20;
        float salarioFloat = 2300;
        double salarioDouble =  25000; // double salarioDouble = 25000.000; aceita float por defaul
        short numero = 450;
        byte number = 127;   // maximo 127. 128 result error. ou -128 valor maximo
        boolean verdadeiro = true;
        char caractere = 66;

        System.out.println(salarioFloat + " Float");
        System.out.println(numero + " Short");
        System.out.println(age + " Int");
        System.out.println(number + " Byte");
        System.out.println(salarioDouble + " Double ");


    }



}
