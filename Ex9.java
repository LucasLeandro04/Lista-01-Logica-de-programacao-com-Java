import javax.swing.JOptionPane;

public class Ex9 {

    public static void main(String[] args) {

        String login="", senha="";
        int contador = 3;
        boolean acerto = false;

        while (contador > 0 && !acerto) {
            login = JOptionPane.showInputDialog("Informe o Login:");
            senha = JOptionPane.showInputDialog("Informe a Senha:");
            login = login.trim();
            senha = senha.trim();
            if (login.equals("IFSP") && senha.equals("3modMSI")) {
                acerto = true;
            }
            else {
                contador--;
                JOptionPane.showMessageDialog(null, "Login ou senha não coincidem!\nResta(m) " + contador + " tentativas.");
            }
        }
        if (acerto) {
            JOptionPane.showMessageDialog(null, "Login efeituado com sucesso");
        }
        else {
            JOptionPane.showMessageDialog(null, "Acesso negado");
        }
    }
}