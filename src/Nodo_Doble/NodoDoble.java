
package Nodo_Doble;


public class NodoDoble <Tipo> {
        
    private Tipo dato;
    private NodoDoble siguiente;
    private NodoDoble anterior;
    
    public NodoDoble(Tipo dato) {
        this.dato = dato;
        anterior=siguiente=null;
    }

    public Tipo getDato() {
        return dato;
    }

    public void setDato(Tipo dato) {
        this.dato = dato;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
    
    
}

