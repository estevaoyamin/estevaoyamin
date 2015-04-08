package andressapessoa;

import modelo.Pessoa;
import javax.swing.JOptionPane;
public class AndressaPessoa {
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        //tratamento de erros inesperados...
        while (pessoa.getCod()==0)
        {
        try
        {
            pessoa.setCod(Integer.parseInt(JOptionPane.showInputDialog("Digite Código")));
        }
        catch (Exception ex)
        {
            //aqui é que quero fazer quando der erro
            JOptionPane.showInputDialog (null, "Você digitou um código inválido \n Dica: NÚMERO");
        }
        }
        
        pessoa.setNome(JOptionPane.showInputDialog("Digite Nome"));
        pessoa.setSexo(JOptionPane.showInputDialog("Digite Sexo"));
        
        
        JOptionPane.showMessageDialog(null, pessoa.getCod() + "\n" + pessoa.getNome() + "\n" + pessoa.getSexo());
    }
   
}
