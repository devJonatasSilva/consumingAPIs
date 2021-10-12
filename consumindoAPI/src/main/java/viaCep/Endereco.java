
package viaCep;

/**
 *
 * @author jony_
 */
public class Endereco {
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    
    public Endereco() {
    }

    public String getRua() {
        return logradouro;
    }

    public void setRua(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return localidade;
    }

    public void setCidade(String localidade) {
        this.localidade = localidade;
    }

    public String getEstado() {
        return uf;
    }

    public void setEstado(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + ", bairro=" + bairro + ", localidade=" + localidade + ", uf=" + uf + '}';
    }
    
    
    
    
    
}
