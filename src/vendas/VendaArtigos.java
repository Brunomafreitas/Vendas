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
public class VendaArtigos extends Vendas {
    
    private List<Artigo> listaArtigos;
    public VendaArtigos(int noVenda) {
        super(noVenda);
        listaArtigos = new ArrayList<Artigo>();
    }
    
    public List getListaArtigos(){
        return listaArtigos;
    }
    
    
    
}
