import javax.swing.JOptionPane;

public class Ex12 {

    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        
        for (int i = 0; i < 10; i++) {
            for (int m = 0; m < 10; m++) {
               if (i == m) {
                    matriz[i][m] = 1;
                }
                else if ( i < m) {
                    matriz[i][m] = 0;
                }
                else {
                    matriz[i][m] = 2;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int m = 0; m < 10; m++) {

                System.out.print(matriz[i][m] + " ");
            }
            System.out.print("\n");
        }
    }
}