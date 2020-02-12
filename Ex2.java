import javax.swing.JOptionPane;

public class Ex2 {

    public static void main(String[] args) {

        //Atributos 
        double peso, altura, calculo, resultado;

        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu peso: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua altura: "));

        calculo = (altura * altura);
        resultado = (peso / calculo);

        if (resultado < 16.5) {
            JOptionPane.showMessageDialog(null, "Desnutrição");
        } else if (resultado >= 25 && resultado <= 18.5) {
            JOptionPane.showMessageDialog(null, "Abaixo do Peso");
        } else if (resultado >= 16.6 && resultado <= 24.9) {
            JOptionPane.showMessageDialog(null, "Peso Normal");
        } else if (resultado >= 25 && resultado <= 29.9) {
            JOptionPane.showMessageDialog(null, "Sobrepeso");
        } else {
            JOptionPane.showMessageDialog(null, "Obesidade");
        }
    }
}
