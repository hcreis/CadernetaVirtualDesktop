
package Objetos;

import java.sql.Timestamp;

public class Cliente {
    
    
    public String clienteNome;
    private String clienteEndereco;
    private String clienteBairro;
    private String clienteContato;
    private int clienteCodigo;
    private Timestamp clienteVencimento;

    /**
     * @return the clienteNome
     */
    public String getClienteNome() {        
        return clienteNome;
    }

    /**
     * @param clienteNome the clienteNome to set
     */
    public void setClienteNome(String clienteNome) {        
        this.clienteNome = clienteNome;
        
    }

    /**
     * @return the clienteEndereco
     */
    public String getClienteEndereco() {
        return clienteEndereco;
    }

    /**
     * @param clienteEndereco the clienteEndereco to set
     */
    public void setClienteEndereco(String clienteEndereco) {
        this.clienteEndereco = clienteEndereco;
    }

    /**
     * @return the clienteBairro
     */
    public String getClienteBairro() {
        return clienteBairro;
    }

    /**
     * @param clienteBairro the clienteBairro to set
     */
    public void setClienteBairro(String clienteBairro) {
        this.clienteBairro = clienteBairro;
    }

    /**
     * @return the clienteTelefone
     */
    public String getClienteContato() {
        return clienteContato;
    }

    /**
     * @param clienteContato the clienteTelefone to set
     */
    public void setClienteContato(String clienteContato) {
        this.clienteContato = clienteContato;
    }

    /**
     * @return the clienteCodigo
     */
    public int getClienteCodigo() {
        return clienteCodigo;
    }

    /**
     * @param clienteCodigo the clienteCodigo to set
     */
    public void setClienteCodigo(int clienteCodigo) {
        this.clienteCodigo = clienteCodigo;
    }

    /**
     * @return the clienteVencimento
     */
    public Timestamp getClienteVencimento() {
        return clienteVencimento;
    }

    /**
     * @param clienteVencimento the clienteVencimento to set
     */
    public void setClienteVencimento(Timestamp clienteVencimento) {
        this.clienteVencimento = clienteVencimento;
    }
    
    @Override 
    public String toString()
    {
        return clienteNome;
    }
}
