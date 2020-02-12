
import javax.swing.JOptionPane;

public class Ex6 {

    public static void main(String[] args) {

        int numero, div = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                div++;
            }
        }
        if (div == 2) {
            JOptionPane.showMessageDialog(null, numero + " É primo");
        } else {
            JOptionPane.showMessageDialog(null, numero + " Não é primo");
        }
    }
}
