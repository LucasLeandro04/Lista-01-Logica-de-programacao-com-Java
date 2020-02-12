import javax.swing.JOptionPane;


public class Ex5A {

    public static void main(String[] args) {

        int num, i,resultado;
        String exibir="";

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de 1 até 10: "));

        for (i = 0; i <= 10; i++) {
            resultado = num * i;
            exibir += num + " X " + i + " = " + resultado + "\n";
        }
        JOptionPane.showMessageDialog(null, exibir);
    }
}
