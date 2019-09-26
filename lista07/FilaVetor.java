/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista07;

import Lista6.PilhaCheiaException;

/**
 *
 * @author jecunha
 */
public class FilaVetor<T> implements Fila<T> {

    private T[] info;
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite) {
        info = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
        this.inicio = 0;
    }

    @Override
    public void inserir(T valor) {
        if (tamanho == limite) {
            throw new FilaCheiaException();
        }
        int temp = (inicio + tamanho) % limite;
        info[temp] = valor;
        tamanho++;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }
        return info[inicio];
    }

    @Override
    public T retirar() {
        if (estaVazia()){
            throw new FilaVaziaException();
        }
        
        T valor = peek();
        inicio = (inicio + 1) % limite;
        tamanho--;
        return valor;
    }

    @Override
    public void liberar() {
        if (!estaVazia()) {
            retirar();
        }
        throw new FilaVaziaException();
    }

    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2){
        FilaVetor<T> f3 = new FilaVetor(f2.limite+this.limite);
        int posicao = inicio;
        
        for (int i = 0;i < tamanho;i++ ){
            f3.inserir(this.info[posicao]);
            posicao++;
            if (posicao == limite){
                posicao = 0;
            }
        }
        
    }
    
    
    
}

