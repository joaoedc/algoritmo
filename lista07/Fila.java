/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista07;

/**
 *
 * @author jecunha
 */
public interface Fila<T> {
    
    void inserir(T valor);
    boolean estaVazia();
    T peek();
    T retirar();
    void liberar();

}
