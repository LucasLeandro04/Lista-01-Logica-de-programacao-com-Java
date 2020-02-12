
import javax.swing.JOptionPane;

public class Ex7 {

    public static void main(String[] args) {

        int numero, sort, tentativas = 0;

        do {
            sort = (int) (Math.random() * 10);
            tentativas++;
            numero = Integer.parseInt(JOptionPane.showInputDialog(tentativas + "º Tentativa: "));

        } while (numero != sort);

        JOptionPane.showMessageDialog(null, "Acertou na " + tentativas + " tentativa!");
    }
}
