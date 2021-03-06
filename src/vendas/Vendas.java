/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendas;

import java.util.Date;

/**
 *
 * @author Utilizador
 */
public class Vendas {

    private int noVenda;
    private Date dataVenda;
    private float valor;
    
    public Vendas(int noVenda){
        this.noVenda = noVenda;
    }

    public int getNoVenda() {
        return noVenda;
    }

    

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
   
    
}
