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
    public VendaArtigos(int noVenda, String tipo) {
        super(noVenda,tipo);
        listaArtigos = new ArrayList<Artigo>();
    }
    
    public List getListaArtigos(){
        return listaArtigos;
    }
    
    public int contaVendaArtigo(){
        int countArtigo = 0;
        for(Artigo a : listaArtigos){
            countArtigo++;
        }
        
        return countArtigo;
    }
    
    
    
}
