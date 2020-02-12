import javax.swing.JOptionPane;

public class Ex5 {


    public static void main(String[] args) {

        int num, i;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de 1 até 10: "));

        for (i = 0; i <= 10; i++) {
            System.out.println(num + "x" + i + " = " + num * i);
        }
    }
}
