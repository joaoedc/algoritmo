/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class ListaEncadeada<T> {
    
    private NoLista primeiro = null;
    private T[] info;
    private int tamanho;

    public ListaEncadeada() {
        tamanho = 0;
    }

    public NoLista getPrimeiro() {
        return primeiro;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

//    orden de complaxidade -->> o laço de repeticao é proporcional ao tamanho do problema e nao existem
//    lacos aninhados, logo O(n)
    
//    public void redimensionar() {
//        int novoTamanho = info.length + 10;
//        Object novoVetor[] = (T[])new Object[novoTamanho];
//        for (int i = 0;i == info.length-1; i++){
//            novoVetor[i] = info[i]; 
//        }
//        
//        info = novoVetor;
//            
//    }
    
    //solucao alternativa do professor
    private void redimensionar1() {
        T[] novo = (T[])new Object[info.length];
        for(int i=0; i<info.length; i++){
            novo[i] = info[i];
        }
        info = novo;
    }
    
    
//    solucao professor
//    é linear (O(n)), pois o método redimencionar() possui laco de repeticao
//    já no melhor caso o G(1) é constante, pois nao varia  
    public void inserir(T valor) {
        if (tamanho == info.length){
            redimensionar1();
        }
        info[tamanho] = valor;
        tamanho++;

    }

    public void exibir() {
        for(int i=0; i<tamanho;i++)
            System.out.println(info[i]);

    }

    public NoLista<T> buscar(T info) {
        NoLista<T> p = primeiro;
        
        while(p!=)
        
        return -1;
        
    }
    
    public int obterComprimento(){
        int qtdNos = 0;
        NoLista<T> p = primeiro;
        
        while (p!=null){
            qtdNos++;
            p = p.getProximo();
        }
        return qtdNos;
    }
    
    public NoLista<T> obterNo(int idx){
        if (idx < 0){
            throw new IndexOutOfBoundsException();
        }
        
        NoLista<T> p = getPrimeiro();
        for(int i=0; (p!=null && (i<idx)); i++){
            
        }
        if (p==null){
            throw new IndexOutOfBoundsException();
        }
        return p;
            
    }
    

    public void retirar(T valor) {
        int posicao = buscar(valor);
        if (posicao < -1){
            for (int i=0;i<tamanho-1;i++){
                info[i]=info[i+1];
//  percorre o vetor a partir do dado selecionado e substitui a posicao posterior na posicao atual
            }
        }
        tamanho--;
        info[tamanho] = null;
    }

    public void liberar() {
        //info = (T[]) new Object;
        tamanho = 0;
    }

    public T obterElemento(int posicao) {
       if (posicao >= 0 && (posicao <tamanho)){
           return info[posicao];
       } else {
           throw new IndexOutOfBoundsException();
       }
    }

    public boolean estaVazia() {
        return tamanho==0;
    }


    @Override
    public String toString() {
        String resultado = "";
        
        for (int i=0; i<tamanho; i++){
            if(i>0){
                resultado += ",";
                resultado += info[i];
            }
        }
        return resultado;
    }
    
}
