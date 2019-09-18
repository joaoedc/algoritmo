/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class NoListaDupla<T> {
    
    
    
    
    
    
    
    
    
    
    
    
    
    public NoListaDupla<T> buscar(T valor){
        NoListaDupla<T> p = primeiro;
        
        while(p != null){
        if(p.getInfo().equals(valor)){
            return p;
            p = p.getProximo();
        }
    }
        return null;
    }
    
    //retira da estrutura de dado armezanado na lista
    public void retirar(T valor){
        NoListaDupla<T> p = buscar(valor);
        
        if(p!=null){
            if (primeiro == p){
                primeiro = p.getProximo();
            } 
            else
                p.getAnterior().setPrimeiro()(getProximo());
                
            if(p.getProximo() != null){
                p.getProximo().setAnterior(p.getAnterior());
            }    
        }
    }
    
    
    private NoListaDupla<T> obterUltimo(){
        NoListaDupla ultimo = primeiro;
        
        NoListaDupla p = primeiro;
        while(p != null ){
            ultimo = p;
            p = p.getProximo();
        }
        return ultimo;
    }
    
    
    public void exibirOrdenInversa(){
        NoListaDupla p = obterUltimo();
        
        while(p != null){
            System.out.println(p.getInfo());
            p = p.getAnterior();
        }
    }
    
    
    public void liberar(){
        = getPrimeiro();
        
        NoListaDupla<T> copia;
        while(p!=null){
            p.setAnterior(null);
            copia = p.getProximo();
            p.setProximo();
            p = copia;
        }
    }
    
    
    public String toString(){
        Strin resultado = "";
        NoListaDupla<T> p = primeiro;
        
        while(p!=primeiro){
            resultado += ",";
            
            resultado += p.getInfo();
            p = p.getProximo();
        }
        return resultado;
    }
}
