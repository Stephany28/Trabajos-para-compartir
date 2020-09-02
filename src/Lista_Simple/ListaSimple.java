
package Lista_Simple;

import Nodo_Simple.NodoSimple;

public class ListaSimple <Tipo> {
    NodoSimple primero;
    
    public ListaSimple() {
        primero = null;
    }
   
    public ListaSimple insertarPrimero(Tipo elem){
        NodoSimple nuevo= new NodoSimple(elem);
        if(primero!=(null)){
            nuevo.setSiguiente(primero);
        }
        primero=nuevo;  
        return this;
    }
    public ListaSimple insertarUltimo(Tipo elem){
         NodoSimple nuevo= new NodoSimple(elem);
         NodoSimple aux;
         aux=primero;
         while(aux.getSiguiente()!=null){
              aux=aux.getSiguiente();
         }
         aux.setSiguiente(nuevo);
         return this;
    }
    public ListaSimple elminarPrimero(){
        NodoSimple aux=primero;
        if(primero.getSiguiente()!= null){
            primero = aux.getSiguiente();
            aux.setSiguiente(null);
        }
        else if(primero.getSiguiente()!=null){
            primero=aux.getSiguiente();
            aux.setSiguiente(null);
        }       
        return this;
    }
    
    public ListaSimple eliminarUltimo(){
        NodoSimple aux=primero;
        while (aux.getSiguiente().getSiguiente()!=null){
            aux=aux.getSiguiente();
        }
        aux.setSiguiente(null);
        return this;
    }
    
    @Override
    public String toString() {
        String salida ="";
        NodoSimple actual;
        for(actual=primero; actual!=null; actual=actual.getSiguiente())
            salida = salida + actual.getDato() + " , ";
        return salida;       

    }
  
    
}

