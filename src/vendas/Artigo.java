/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendas;

/**
 *
 * @author Utilizador
 */
public class Artigo {
    private int id;
    private String nome;
    private int CountId = 0;

    /**
     *
     * @param nome
     * Construtor da classe Artigo
     */
    public Artigo(String nome){
        this.nome = nome;
        CountId++;
        id = CountId;
    }
    
    /**
     *
     * @return
     * método que retorna  o id de um artigo
     */
    public int getId(){
        return id;
    }
    
    /**
     *
     * @return
     * método que retorna o nome de um artigo
     */
    public String getNome(){
        return nome;
    }
    
    
}
