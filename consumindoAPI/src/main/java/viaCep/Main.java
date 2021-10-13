
package viaCep;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jony_
 */
public class Main {
    public static void main(String[] args) throws Exception{
        
        //System.out.println("informe seu cep: ");
        String meuCep = JOptionPane.showInputDialog("digite o seu cep: ");//new Scanner(System.in).nextLine();
        Endereco endereco = ServicoDeCep.buscarEnderecoPelo(meuCep);
        
        String mensagem =                 
                "rua: " + endereco.getRua() +"\n"+
                "bairro: " + endereco.getBairro()+"\n"+
                "cidade: "+ endereco.getCidade() + "\n"+
                "estado: "+ endereco.getEstado() + "\n"
            ;
        JOptionPane.showMessageDialog(null,mensagem);
        /*System.out.println("rua: "+ endereco.getRua());
        System.out.println("bairro: "+ endereco.getBairro());
        System.out.println("cidade: "+ endereco.getCidade());
        System.out.println("estado: "+ endereco.getEstado());*/
    
    }    
}
