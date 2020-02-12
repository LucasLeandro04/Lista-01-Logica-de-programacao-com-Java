import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;

public class Ex1 {

    public static void main(String[] args) throws ParseException {

        String nomeCliente, endereco, dtEntrega;
        Double vlrCompra;

        nomeCliente = JOptionPane.showInputDialog(null, "Informe o nome do(a) cliente: ");
        endereco = JOptionPane.showInputDialog(null, "Informe o endereço: ");
        vlrCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da compra: "));
        dtEntrega = JOptionPane.showInputDialog(null, "Informe a data de entrega (c/barras): ");

        SimpleDateFormat conversao = new SimpleDateFormat("dd/MM/yyyy");

        Date data = conversao.parse(dtEntrega);

        JOptionPane.showMessageDialog(null, "AVISO\n\n" + "Caro cliente Sr(a) " + nomeCliente + ", os produtos da sua compra no \n valor de R$ " + vlrCompra + " serão entregues no endereco abaixo:\n Rua " + endereco + ".\n Data da Entrega: " + dtEntrega + "\n\n********************Obrigado pela Preferência!********************");
    }

}
