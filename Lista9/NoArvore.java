/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista9;

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

    public void inserirFilho(NoArvore sa){
        sa.proximo = primeiro;
        primeiro = sa;
    }
    
    
    
}
