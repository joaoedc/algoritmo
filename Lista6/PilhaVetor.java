
import Lista6.PilhaCheiaException;
import Lista6.PilhaVaziaException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class PilhaVetor<T> implements Pilha<T> {

    private T[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        //this.limite = 10;
        info = (T[]) new Object[limite];

    }

    public T pop() {
        if (estaVazia()) {
            throw new PilhaVaziaException("Pilha vazia");
        }

        T valor;
        valor = peek();

        tamanho = tamanho - 1;
        return valor;
    }

    public T peek() {
        if (estaVazia()) {
            throw new PilhaVaziaException("Pilha vazia");
        }
        return info[tamanho - 1];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void liberar() {
//        T[] temp = (T[]) new Object[limite];
//        info = temp;
        

        
        while (!estaVazia()) {
            pop();
        }

    }

    public void push(T valor) {
        if (limite == tamanho) {
            throw new PilhaCheiaException("Excedeu os limites da pilha");
        }
        info[tamanho] = valor;
    }

    public String toString() {
        String resultado = "";

        for (int i = tamanho - 1; i >= 0; i--) {
            resultado += info[i];
            if (i > 0) {
                resultado += ", ";
            }
        }
        return resultado;
    }

    public void concatenar(PilhaVetor<T> p) {
        
        for(int i=0;i<p.tamanho;i++){
            this.push(p.info[i]);
        }
    }
}
