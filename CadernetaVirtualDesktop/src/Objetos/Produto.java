package Objetos;

/**
 *
 * @author Helen Cassia
 */
public class Produto {
    
    private String produtoNome;
    private Double produtoValor;
    private String produtoCodigo;

    /**
     * @return the produtoNome
     */
    public String getProdutoNome() {
        return produtoNome;
    }

    /**
     * @param produtoNome the produtoNome to set
     */
    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    /**
     * @return the produtoValor
     */
    public Double getProdutoValor() {
        return produtoValor;
    }

    /**
     * @param produtoValor the produtoValor to set
     */
    public void setProdutoValor(Double produtoValor) {
        this.produtoValor = produtoValor;
    }

    /**
     * @return the produtoCodigo
     */
    public String getProdutoCodigo() {
        return produtoCodigo;
    }

    /**
     * @param produtoCodigo the produtoCodigo to set
     */
    public void setProdutoCodigo(String produtoCodigo) {
        this.produtoCodigo = produtoCodigo;
    }
    
    @Override
    public String toString(){
        return this.produtoNome;
    }
    
    
}
