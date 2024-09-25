import javax.swing.JOptionPane;

public class Algoritmo {
    public static void main(String[] args) {
        String entrada;
        int numero1, numero2, soma;
        int continuar;

        do {

            entrada= JOptionPane.showInputDialog("Informe o primeiro número:");
            numero1 = Integer.parseInt(entrada);

            entrada= JOptionPane.showInputDialog("Informe o segundo número:");
            numero2 = Integer.parseInt(entrada);

            soma= numero1 + numero2;
            JOptionPane.showMessageDialog(null, "A soma é: " + soma);

            continuar= JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Escolha", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}