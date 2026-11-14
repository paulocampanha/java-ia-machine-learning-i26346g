package aula03a;

public class Classificar {

    public static String prever(int horas) {
        if (horas >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }

    } 

    public static void main(String[] args) { 
      
        String resultado = prever(4);
        System.out.println(resultado);
    }
}
