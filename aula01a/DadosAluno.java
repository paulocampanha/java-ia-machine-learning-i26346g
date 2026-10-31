/**
 * Nesse programa vamos rever as principais variáveis primitvas e o tipo
 * String 
 */

package aula01a;

public class DadosAluno {

    public static void main(String args[]) {

        String nome = "Gaspar";
        int idade = 17;
        double nota = 4.5;
        boolean aprovado = true;

        System.out.println("Nome do aluno: " + nome.toUpperCase());
        System.out.println("Idade: " + idade);

        if (nota >= 7) {
            aprovado = true;
        } else {
            aprovado = false;
        }

        if (aprovado) {
            System.out.println("O Aluno " + nome + " está aprovado.");
        } else {
            System.out.println("O aluno " + nome + " está reprovado.");
        }
    }
}