import java.util.ArrayList;
import java.util.List;

public class questao3 {
   public static void main(String[] args) {
        int[] faturamentoDiario = {1200, 1500, 0, 0, 1800, 1900, 0, 2000, 2100, 0, 0, 1750, 1600};

        long startTime = System.nanoTime();

        List<Integer> faturamentoValido = new ArrayList<>();
        for (int valor : faturamentoDiario) {
            if (valor > 0) {
                faturamentoValido.add(valor);
            }
        }

        int menorFaturamento = faturamentoValido.stream().mapToInt(v -> v).min().orElse(0);
        int maiorFaturamento = faturamentoValido.stream().mapToInt(v -> v).max().orElse(0);

        double soma = faturamentoValido.stream().mapToInt(v -> v).sum();
        double media = soma / faturamentoValido.size();

        List<Integer> diasAcimaDaMedia = new ArrayList<>();
        for (int valor : faturamentoDiario) {
            if (valor > media) {
                diasAcimaDaMedia.add(valor);
            }
        }

        long endTime = System.nanoTime();

        double executionTime = (endTime - startTime) / 1_000_000_000.0; 
        System.out.println("Menor valor de faturamento: R$ " + menorFaturamento);
        System.out.println("Maior valor de faturamento: R$ " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia.size() + " com os valores " + diasAcimaDaMedia);
        System.out.println("Tempo de execução: " + executionTime + " segundos");
    }

}


// comando para rodar 
// javac questao3.java  vai criar um arquivo.class no mesmo diretorio
// java questao3 roda o arquivo

