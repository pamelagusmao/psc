import java.util.Scanner;
  public class ControledeNotas{
    public static void main(String[]Args){
       Scanner input = new Scanner (System.in);
        {
            int alunoNotaMaior90=0;
            int alunoReprovado=0;
            int totalAlunos=0;
            double somaNotas=0;
            double maiorNota=Double.NEGATIVE_INFINITY;
            double menorNota=Double.MAX_VALUE;
            
            while (true){
                System.out.println ("Insira a nota final do aluno (negativa para encerrar):");
                double nota= input.nextDouble();
                if (nota<0){
                    break;
                }
                if (nota<0){
                    break;
                }
                if (nota>90){
                    alunoNotaMaior90++;
                }
                if (nota<60){
                    alunoReprovado++;
                }
                totalAlunos++;
                somaNotas+=nota;
                if (nota>maiorNota){
                    maiorNota=nota;
                }
                
                double mediaNotas = totalAlunos > 0 ? somaNotas / totalAlunos:0;
                
                System.out.println ("Número de alunos com nota maior que 90"+ alunoNotaMaior90);
                System.out.println("Número de alunos reprovados (nota>60)"+ alunoReprovado);
                System.out.println("Número total de alunos:" +totalAlunos);
                System.out.println("Média das notas:" +mediaNotas);
                System.out.println("Maior nota:"+ maiorNota);
                System.out.println("Menor nota"+ menorNota);
            }  }
    }
  }
