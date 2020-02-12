import javax.swing.JOptionPane;

public class Ex11 {

    public static void main(String[] args) {

        int[] ivet = new int[1000];
        int contador=0;
        double res;

        for (int i = 0; i < 1000; i++) {
            ivet[i] = (int) (Math.random()*1000);
            
            if (ivet[i] >= 500) {
                contador++;
            }
        }
        res = ((double)contador/1000) * 100;
        JOptionPane.showMessageDialog(null, "Resultado é: " + res + "%");
   }
}