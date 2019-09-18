/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public abstract class Pilha<T> {
    
    public abstract void push(T info);
    
    public abstract T pop();
    
    public abstract T peek();
    
    public abstract boolean estaVazia();
    
    public abstract void liberar();
    
}
