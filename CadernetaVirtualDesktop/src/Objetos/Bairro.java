package Objetos;

/**
 *
 * @author Helen Cassia
 */
public class Bairro {
    
    private String nomeBairro;
    private String codigoBairro;

    /**
     * @return the nomeBairro
     */
    public String getNomeBairro() {
        return nomeBairro;
    }

    /**
     * @param nomeBairro the nomeBairro to set
     */
    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }
    
    /**
     * @return the codigoBairro
     */
    public String getCodigoBairro() {
        return codigoBairro;
    }

    /**
     * @param codigoBairro the nomeBairro to set
     */
    public void setCodigoBairro(String codigoBairro) {
        
        this.codigoBairro = codigoBairro;        
    }
    
    @Override
    public String toString(){
        return this.nomeBairro;
    }
}
