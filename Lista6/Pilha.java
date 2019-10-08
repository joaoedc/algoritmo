/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public interface Pilha<T> {

    void push(T info);

    T pop();

    T peek();

    boolean estaVazia();

    void liberar();

}
