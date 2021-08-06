/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Instrumento;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alan
 */
public class InstrumentoDAO {
    
     private Set<Instrumento> listaDeInstrumentos = new HashSet<Instrumento>();

    public Set<Instrumento> selectListaDeInstrumentos() {
        return listaDeInstrumentos;
    }
    
    public void cadastrarInstrumento(Instrumento instrumento){
        listaDeInstrumentos.add(instrumento);
    }
    
    public void removerInstrumento(Instrumento instrumento){
        listaDeInstrumentos.remove(instrumento);
    }
    
    public Instrumento buscaInstrumento(String cod){
        Instrumento inst=null;
        for(Instrumento i : listaDeInstrumentos){
            if(i.getCodigo().equals(cod)){
               inst=i;
            }
        }
        return inst;
    }
}
