/**
 * Nesse classe vamos armazenar o conhecimento
 * encontrado pelo algoritmo depois do 
 * treinamento.
 * Nesse exemplo, o conhecimento aprendido é
 * o valor do limiar
 * A classe Modelo será responsável por 
 * guardar esse valor e utilizá-lo para 
 * classificar novos alunos
 */

package aula03b;

public class Modelo {
    
    private double limiar;

    public Modelo(double limiar) {
        this.limiar = limiar;
    }

    // Método responsável por classificar
    // um novo aluno
    public String prever(int horasEstudo){
        if (horasEstudo >= limiar) {
            return Aluno.APROVADO;
        } else {
            return Aluno.REPROVADO;
        }
    }

    public double getLimiar() {
        return limiar;
    }
}
