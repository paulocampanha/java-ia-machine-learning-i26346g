package aula02b;
import java.util.ArrayList;

public class ExercicioArrayList {

    public static void main(String[] args) {

   
        ArrayList<String> produtos = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();
        ArrayList<Double> valores = new ArrayList<>();

        produtos.add("Teclado");
        produtos.add("Mouse");
        produtos.add("Monitor");
        produtos.add("Impressora");
        produtos.add("Webcam");
        produtos.add("Headset");

        quantidades.add(10);
        quantidades.add(25);
        quantidades.add(8);
        quantidades.add(5);
        quantidades.add(12);
        quantidades.add(7);

        valores.add(89.90);
        valores.add(45.50);
        valores.add(799.00);
        valores.add(650.00);
        valores.add(129.90);
        valores.add(159.90);

        System.out.println("=== LISTA DE PRODUTOS ===");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(
                "Produto: " + produtos.get(i)
                + " - Quantidade: " + quantidades.get(i)
                + " - Valor: R$ " + valores.get(i)
            );
        }

        System.out.println("\nQuantidade de produtos cadastrados: "
                + produtos.size());

        System.out.println("Produto: " + produtos.get(2));
        System.out.println("Quantidade: " + quantidades.get(2));
        System.out.println("Valor: R$ " + valores.get(2));

        valores.set(1, 49.90);

        if (produtos.contains("Webcam")) {
            System.out.println("Produto 'Webcan' encontrado.");
        } else {
            System.out.println("Produto 'Webcan' não encontrado.");
        }
                
        int indiceRemocao = produtos.indexOf("Mouse");

        produtos.remove(indiceRemocao);
        quantidades.remove(indiceRemocao);
        valores.remove(indiceRemocao);

        System.out.println("\n=== LISTA ATUALIZADA ===");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(
                "Produto: " + produtos.get(i)
                + " | Quantidade: " + quantidades.get(i)
                + " | Valor: R$ " + String.format("%.2f", valores.get(i))
            );
        }

        // Desafio: soma as quantidades dos produtos restantes.
        int somaQuantidades = 0;

        for (int i = 0; i < quantidades.size(); i++) {
            somaQuantidades += quantidades.get(i);
        }

        System.out.println("\nSoma das quantidades dos produtos restantes: "
                + somaQuantidades);
    }
}
