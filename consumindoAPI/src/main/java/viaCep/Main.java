
package viaCep;

import java.util.Scanner;

/**
 *
 * @author jony_
 */
public class Main {
    public static void main(String[] args) throws Exception{
        
        System.out.println("informe seu cep: ");
        String meuCep = new Scanner(System.in).nextLine();
        Endereco endereco = ServicoDeCep.buscarEnderecoPelo(meuCep);
        
        System.out.println("rua: "+ endereco.getRua());
        System.out.println("bairro: "+ endereco.getBairro());
        System.out.println("cidade: "+ endereco.getCidade());
        System.out.println("estado: "+ endereco.getEstado());
    
    }    
}
