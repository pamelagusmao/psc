import java.util.Scanner;
public class DesempenhoNotas {
    public static void main  (String []Args){
        Scanner input= new Scanner (System.in);
        while (true) {
        System.out.println("Informe a matricula do aluno (ou numero negativo para encerrar:)");
        int matricula=input.nextInt();
        if (matricula<0){
        System.out.println("Programa encerrado!");
        break;
        }
        System.out.println("informe a primeira nota");
        double nota1=input.nextDouble();
        System.out.println("Informe a segunda nota");
        double nota2=input.nextDouble();
        System.out.println("Informe a terceira nota");
        double nota3=input.nextDouble();
        double media=(nota1+nota2+nota3)/3;
        System.out.printf("Média das notas: %.2f%n", media);
        if (media>=70){
        System.out.println("Aluno aprovado!");
        } else if (media>=60){
        System.out.println ("Atenção!! Aluno em recuperação!");
        } else {
            System.out.println("Atenção!! Aluno Reprovado!");
        }


        }

        }



        }
       
































    
