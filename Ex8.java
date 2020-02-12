import javax.swing.JOptionPane;

public class Ex8 {

    public static void main(String[] args) {

        double media, soma=0, nota;
        int contador=0, resp;

        do {
            contador++;
            nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + contador + "ª Nota:"));
            soma += nota;
            resp = JOptionPane.showConfirmDialog(null, "Notas informadas: " + contador + "\n\nDeseja informar mais uma nota?");

        } while (resp == 0);

        media = soma / contador;

        JOptionPane.showMessageDialog(null, "A média das notas inseridas é: " + media);        
    }
}