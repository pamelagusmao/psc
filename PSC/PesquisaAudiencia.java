import java.util.Scanner;

public class PesquisaAudiencia {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

      
        int[] canais = {2, 4, 5, 7, 12};
        int[] audiencia = new int[canais.length];
        int totalPessoas = 0;

    
        while (true) {
            System.out.println("Digite o número do canal (ou 0 para encerrar): ");
            int canal = input.nextInt();
            
          
            if (canal == 0) {
                break;
            }
            
           
            boolean canalValido = false;
            for (int i = 0; i < canais.length; i++) {
                if (canais[i] == canal) {
                    canalValido = true;
                    System.out.print("Digite o número de pessoas assistindo: ");
                    int pessoas = input.nextInt();
                    
                   
                    audiencia[i] += pessoas;
                    totalPessoas += pessoas;
                    break;
                }
            }
            
            
            if (!canalValido) {
                System.out.println("Canal inválido! Por favor, digite um canal válido.");
            }
        }

        System.out.println("\nPercentual de audiência de cada canal:");
        for (int i = 0; i < canais.length; i++) {
            double percentual = (totalPessoas == 0) ? 0 : (100.0 * audiencia[i] / totalPessoas);
            System.out.printf("Canal %d: %.2f%%\n", canais[i], percentual);
        }

        input.close(); 
    }
}