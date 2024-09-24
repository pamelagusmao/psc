import java.util.Scanner;

public class MediaSalarial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPessoas = 0;
        double somaSalarios = 0;
        double somaFilhos = 0;

        while (true) {
            System.out.print("Digite o salário (negativo para encerrar): ");
            double salario = input.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.print("Digite o número de filhos: ");
            int filhos = input.nextInt();

            somaSalarios+= salario;
            somaFilhos+= filhos;
            totalPessoas++;
        }

      
        double mediaSalario = (totalPessoas == 0) ? 0 : somaSalarios / totalPessoas;
        double mediaFilhos = (totalPessoas == 0) ? 0 : somaFilhos / totalPessoas;

        System.out.printf("Média salarial da população: %.2f\n", mediaSalario);
        System.out.printf("Média do número de filhos: %.2f\n", mediaFilhos);

        input.close();
    }
}