import javax.swing.JOptionPane;

public class Ex3 {

    public static void main(String[] args) {

        double num1, num2, resultado = 0;
        int operacao;

        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o primeiro número: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o segundo número: "));

        operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a operação: \n 1-Somar\n 2-Subtrair \n 3-Multiplicar \n 4-Dividir"));

        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                break;

            case 2:
                resultado = num1 - num2;
                break;

            case 3:
                resultado = num1 * num2;
                break;

            case 4:
                resultado = num1 / num2;
                break;
        }
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);

    }

}
