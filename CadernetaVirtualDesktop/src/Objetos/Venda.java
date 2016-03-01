/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.sql.Timestamp;

/**
 *
 * @author helen
 */
public class Venda {

    private int vendaCodigo;
    private int produtoCodigo;
    private int clienteCodigo;
    private Timestamp vendaData;
    private double vendaProdutoQtd;
    private double vendaTotal;
    private String vendaLogin;
    private int vendaStatus;

    /**
     * @return the vendaCodigo
     */
    public int getVendaCodigo() {
        return vendaCodigo;
    }

    /**
     * @param vendaCodigo the vendaCodigo to set
     */
    public void setVendaCodigo(int vendaCodigo) {
        this.vendaCodigo = vendaCodigo;
    }

    /**
     * @return the produtoCodigo
     */
    public int getProdutoCodigo() {
        return produtoCodigo;
    }

    /**
     * @param produtoCodigo the produtoCodigo to set
     */
    public void setProdutoCodigo(int produtoCodigo) {
        this.produtoCodigo = produtoCodigo;
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
     * @return the vendaData
     */
    public Timestamp getVendaData() {
        return vendaData;
    }

    /**
     * @param vendaData the vendaData to set
     */
    public void setVendaData(Timestamp vendaData) {
        this.vendaData = vendaData;
    }

    /**
     * @return the vendaProdutoQtd
     */
    public double getVendaProdutoQtd() {
        return vendaProdutoQtd;
    }

    /**
     * @param vendaProdutoQtd the vendaProdutoQtd to set
     */
    public void setVendaProdutoQtd(double vendaProdutoQtd) {
        this.vendaProdutoQtd = vendaProdutoQtd;
    }

    /**
     * @return the vendaTotal
     */
    public double getVendaTotal() {
        return vendaTotal;
    }

    /**
     * @param vendaTotal the vendaTotal to set
     */
    public void setVendaTotal(double vendaTotal) {
        this.vendaTotal = vendaTotal;
    }

    /**
     * @return the vendaLogin
     */
    public String getVendaLogin() {
        return vendaLogin;
    }

    /**
     * @param vendaLogin the vendaLogin to set
     */
    public void setVendaLogin(String vendaLogin) {
        this.vendaLogin = vendaLogin;
    }

    /**
     * @return the vendaStatus
     */
    public int getVendaStatus() {
        return vendaStatus;
    }

    /**
     * @param vendaStatus the vendaStatus to set
     */
    public void setVendaStatus(int vendaStatus) {
        this.vendaStatus = vendaStatus;
    }

}
