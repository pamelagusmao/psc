import javax.swing.JOptionPane;

public class ContaBanco {
    public static void main(String[] args) {
        String entrada;
        int conta, contaInvertida, soma, ContaBanco;
        int continuar;

        do {
            
            entrada = JOptionPane.showInputDialog("Informe o número da conta (três dígitos):");
            conta = Integer.parseInt(entrada);

           
            int c = conta / 100;        
            int d = (conta / 10) % 10;  
            int u = conta % 10;          
            contaInvertida = (u * 100) + (d * 10) + c;

   
            soma = conta + contaInvertida;

            int unidades = soma % 10;
            int dezenas = (soma / 10) % 10;
            int centenas = (soma / 100) % 10;
            int milhar = (soma / 1000) % 10;

            int resultadoMultiplicacao = (unidades * 0) + (dezenas * 1) + (centenas * 2) + (milhar * 3);

            ContaBanco= resultadoMultiplicacao % 10;

            JOptionPane.showMessageDialog(null, "O dígito verificador é: " + ContaBanco);

            continuar = JOptionPane.showConfirmDialog(null, "Deseja calcular outro dígito verificador?", "Escolha", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}