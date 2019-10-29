/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista9;

/**
 *
 * @author jecunha
 */
public class Arvore<T> {

    private NoArvore raiz;

    public Arvore() {
        raiz = null;
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore raiz) {
        this.raiz = raiz;
    }

    public String toString() {
        if (raiz != null) {
            return obterRepresentcaoTextual(raiz);
        } else
            return "";

    }

    private String obterRepresentcaoTextual(NoArvore<T> no){
        NoArvore<T> p;
        
        String s = "<";
        s += no.getInfo();
        
        p = no.getPrimeiro();
        
        while (p != null){
            s += obterRepresentcaoTextual(p);
            p = p.getProximo();
        }
        s += ">";
        return s;
    }
    
    public boolean pertence(NoArvore<T> p){
        return buscar(raiz, info) != null;
    }
    
    
    
}
