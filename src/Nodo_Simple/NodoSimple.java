
package Nodo_Simple;

public class NodoSimple <Tipo>{
    private Tipo dato; 
    private NodoSimple siguiente;
     
    public NodoSimple( Tipo dato) {
        this.dato = dato;
        siguiente = null;        
    }

    public Tipo getDato() {
        return dato;
    }

    public void setDato(Tipo dato) {
        this.dato = dato;
    }
    
    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }

    

    @Override
    public String toString() {
        return "Nodo{" + "siguiente=" + siguiente + ", dato=" + dato + '}';
    }
}

