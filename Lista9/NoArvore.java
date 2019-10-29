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
public class NoArvore<T> {
    
    private T info;
    private NoArvore primeiro;
    private NoArvore proximo;
    

    public NoArvore(T info) {
        this.info = info;
        this.primeiro = null;
        this.proximo = null;
    }
    
    public void inserirFilho(NoArvore<T> sa){
        sa.setProximo(primeiro);
        setPrimeiro(sa);
    }
    
    public void setInfo(T info){
        this.info = info;
    }
    
    public T getInfo(){
        return info;
    }

    public NoArvore getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoArvore primeiro) {
        this.primeiro = primeiro;
    }

    public NoArvore getProximo() {
        return proximo;
    }

    public void setProximo(NoArvore proximo) {
        this.proximo = proximo;
    }
    
    
    
}
