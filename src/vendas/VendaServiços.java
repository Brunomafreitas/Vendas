/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Utilizador
 */
public class VendaServiços extends Vendas{
    private List<Servicos> listaServicos;
    public VendaServiços(int noVenda, String tipo) {
        super(noVenda, tipo);
        
        listaServicos = new ArrayList<Servicos>();
    }
    
    public List getListaServicos(){
        return listaServicos;
    }
    
    
    
}
