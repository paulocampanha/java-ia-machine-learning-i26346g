/**
 * Nesse programa vamos usar um vetor para armazenar as notas de um aluno.
 */

public class AnaliseNotas {
    
    public static void main(String args[]) {

        double[] notas = {7.5, 6.0, 9.0, 8.5, 5.0 };
        String[] nome = {"Gaspar", "Anabela", "Luiza", "Jorge", "Bruce"};

        for (int i = 4; i >=0; i--) {
        System.out.println("O aluno " + nome[i] + " obteve a nota " + notas[i]);
        }

        int contador = 0;
        double soma = 0.0;

        while (contador < notas.length) {
            soma += notas[contador];
            contador++;
        }
        double media = soma / notas.length;
        System.out.println("Média das notas" + media);
    }
}
