
package Nodo_Doble_Circular;


public class NodoDobleCircular <Tipo>{
    private Tipo dato;
    private NodoDobleCircular anterior;
    private NodoDobleCircular siguiente;
        
    public NodoDobleCircular(Tipo dato) {
        this.dato = dato;
        anterior=this.siguiente=siguiente;
    }

    public Tipo getDato() {
        return dato;
    }

    public void setDato(Tipo dato) {
        this.dato = dato;
    }

    public NodoDobleCircular getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDobleCircular anterior) {
        this.anterior = anterior;
    }

    public NodoDobleCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDobleCircular siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
