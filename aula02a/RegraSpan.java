/**
 * Nesse programa vamos simular a detecção de um
 * e-mail classificado como SPAM
 */   
package aula02a;

public class RegraSpan {
    public static void main(String args[]){
        String assunto = "Como ganhar um premio agora";

        // Regra explicita definida pelo programador
        if (assunto.toLowerCase().contains("ganhe")) {
            System.out.println("Mensagem suspeita");
        } else {
            System.out.println("Mensagem sem alerta " +
            "para essa regra");
        }
    }
}
