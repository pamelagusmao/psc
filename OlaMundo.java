import java.util.Scanner;
public class OlaMundo {
 public static void main (String args[]){
  System.out.println ("Olá, Mundo!!!:D");
  Scanner teclado= new Scanner (System.in);
  int num1, num2, result;
  System.out.println ("informe o primeiro número");
  num1= teclado.nextInt (); 
  System.out.println ( "informe o segundo número");
  num2=teclado.nextInt();
  result=num1+num2;
  System.out.println ("Soma= " + result);
  teclado.close();
 } 
} 
