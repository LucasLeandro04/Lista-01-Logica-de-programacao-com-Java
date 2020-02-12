import javax.swing.JOptionPane;

public class Ex10 {

    public static void main(String[] args) {

        int[] numero = new int[10];
        int contPar=0, contImpar=0, somaPar=0, somaImpar=0;

        for(int i = 0; i < 10; i++) {

            numero[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o " + (i+1) + " valor:"));

            if (numero[i] % 2 == 0) {
                contPar++;
                somaPar += numero[i];
            }
            else {
                contImpar++;
                somaImpar += numero[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Número de pares é: " + contPar + "\nMedia dos pares é: " + (somaPar/contPar));
        JOptionPane.showMessageDialog(null, "Número de Impares é: " + contImpar + "\nMedia dos pares é: " + (somaImpar/contImpar));      
    }
}