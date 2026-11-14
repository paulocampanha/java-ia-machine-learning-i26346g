package aula02b;

import java.util.ArrayList;

public class Lista02 {

    public static void main(String args[]) {

        ArrayList<String> nomes = new ArrayList<>();

        // Adicionar elementos na array
        nomes.add("Gaspar");
        nomes.add("Luiza");
        nomes.add("Jorge");
        nomes.add("Anabela");
        nomes.add("Bruce");

        ArrayList<Integer> idades = new ArrayList<>();

        idades.add(16);
        idades.add(30);
        idades.add(25);
        idades.add(19);
        idades.add(16);

        // Alterar elementos da array
        nomes.set(2, "Camila");
        idades.set(2, 35);

        // REmove elemento da array pelo índice
        nomes.remove(4);
        idades.remove(4);

        // Remove elemento da array pelo conteúdo
        nomes.remove("Luiza");
        idades.remove(Integer.valueOf(30));

        // Verifica a existencia do elemento
        if (nomes.contains("Luiza")) {
            System.out.println("Nome Luiza encontrado");
        } else {
            System.out.println("Nome Luiza não encontrado");
        }

        if (nomes.contains("Gaspar")) {
            // Seleciona a posição do elemento
            int posicao = nomes.indexOf("Gaspar");
            System.out.println("A idade do Gaspar é " +
                    idades.get(posicao));
        }

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i) +
                    " - Idade: " + idades.get(i));
        }

        // Limpa o conteúdo do array
        nomes.clear();

        // Verificar se alista está vazia
        if (nomes.isEmpty()) {
            System.out.println("A lista está vazia");
        }

    }
}
