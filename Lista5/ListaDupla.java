/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João Eduardo Cunha
 */
public class ListaDupla<T> {

    private NoListaDupla<T> primeiro;

    public ListaDupla() {
        primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T info) {
        NoListaDupla<T> novo = new NoListaDupla<T>();
        novo.setInfo(info);
        novo.setProximo(primeiro);
        novo.setAnterior(null);
        if (primeiro != null) {
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public NoListaDupla<T> buscar(T info) {
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            if (p.getInfo().equals(info)) {
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T info) {
        NoListaDupla<T> p = buscar(info);
        if (p != null) {
            if (primeiro == p) {
                primeiro = p.getProximo();
            } else {
                p.getAnterior().setProximo(p.getProximo());
            }
            if (p.getProximo() != null) {
                p.getProximo().setAnterior(p.getAnterior());
            }
        }
    }

    private NoListaDupla<T> obterUltimo() {
        NoListaDupla<T> ultimo = primeiro;
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            ultimo = p;
            p = p.getProximo();
        }
        return ultimo;
    }

    public int obterComprimento() {  //é possivel otimizar,
        //para otimizar criar uma variavel de instancia no metodo inserir

        int qtdeNos = 0;
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            qtdeNos++;
            p = p.getProximo();
        }
        //  p.setProximo(primeiro);
        return qtdeNos;
    }

    public void exibirOrdenInversa(){
        NoListaDupla p = obterUltimo();
        
        while(p != null){
            System.out.println(p.getInfo());
            p = p.getAnterior();
        }
    }
    
    public void liberar() {
        NoListaDupla<T> p = new NoListaDupla<T>();
        NoListaDupla<T> segundaLista;
        while (p != null) {
            p.setAnterior(null);
            segundaLista = p.getProximo();
            p.setProximo(primeiro = null);
            p = segundaLista;
        }
    }

    public String tostring() {
        String resultado = "";
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            if (p != primeiro) {
                resultado += ",";
                resultado += p.getInfo();
            }

        }
        return resultado;
    }


    public int obterUltimaPosicao(T info) {
        NoListaDupla<T> p = primeiro;
        int indice = 0;
        while (p != null) {
            if (p.getInfo().equals(info)) {
                return indice;
            }
            p = p.getProximo();
            indice++;
        }
        return -1;
    }
    
     public NoListaDupla<T> getNo(int index) {
        int aux = 0;
        
         if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        NoListaDupla<T> n = getPrimeiro();
        while (n != null) {
            if (index == aux) {
                return n;
            }
            n = n.getProximo();
            aux++;
            
        }
        
        
        throw new IndexOutOfBoundsException();
    }
     
     
    public ListaDupla<T> CriarSubLista(int inicio, int fim) {
        int comp = obterComprimento();
        if ((inicio < 0) || (fim >= comp)) {
            throw new IndexOutOfBoundsException();
        }
        ListaDupla<T> newList = new ListaDupla<>();
        for (int i = 0; i < comp; i++) {
            if ((i >= inicio) && (i <= fim)) {
                NoListaDupla<T> no = getNo(i);
                newList.inserir(no.getInfo());
            }
            
        }
        
        return newList;
    }
}
