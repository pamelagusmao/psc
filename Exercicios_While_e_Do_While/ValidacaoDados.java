import javax.swing.JOptionPane;

public class ValidacaoDados {
    public static void main(String[] args) {
        double nota;
        double salario;
        char sexo;
        int idade;
        int continuar;

        do {
 
            do {
                String entrada = JOptionPane.showInputDialog("Informe a nota (entre 0 e 10):");
                nota = Double.parseDouble(entrada);
                if (nota < 0 || nota > 10) {
                    JOptionPane.showMessageDialog(null, "Nota inválida. Deve estar entre 0 e 10.");
                }
            } while (nota < 0 || nota > 10);

            do {
                String entrada = JOptionPane.showInputDialog("Informe o salário (maior que zero):");
                salario = Double.parseDouble(entrada);
                if (salario <= 0) {
                    JOptionPane.showMessageDialog(null, "Salário inválido. Deve ser maior que zero.");
                }
            } while (salario <= 0);

            do {
                String entrada = JOptionPane.showInputDialog("Informe o sexo (m ou f):");
                sexo = entrada.toLowerCase().charAt(0);
                if (sexo != 'm' && sexo != 'f') {
                    JOptionPane.showMessageDialog(null, "Sexo inválido. Deve ser 'm' para masculino ou 'f' para feminino.");
                }
            } while (sexo != 'm' && sexo != 'f');

            do {
                String entrada = JOptionPane.showInputDialog("Informe a idade (entre 0 e 120):");
                idade = Integer.parseInt(entrada);
                if (idade < 0 || idade > 120) {
                    JOptionPane.showMessageDialog(null, "Idade inválida. Deve estar entre 0 e 120.");
                }
            } while (idade < 0 || idade > 120);

            JOptionPane.showMessageDialog(null, "Dados informados corretamente. Obrigado!");

            continuar = JOptionPane.showConfirmDialog(null, "Deseja validar outros dados?", "Escolha", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}