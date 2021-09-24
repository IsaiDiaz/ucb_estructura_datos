package bo.edu.ucb.est;

public class Lista {
    private int tamanio;
    private Alumno primerElemento;
    public Lista() {
        tamanio = 0;
        primerElemento = null;
    }

    public void agregar(Alumno alumno) {
        tamanio++;
        if (primerElemento == null) {
            primerElemento = alumno;
        } else {
            // Buscamos el ultimo elemento de la lista
            Alumno nodoActual = primerElemento;
            do {
                // Verificamos si estamos al final de la lista.
                if (nodoActual.getApuntadorASiguiente() == null) {
                    // Agregamos el alumno al final
                    nodoActual.setApuntadorASiguiente(alumno);
                } else {
                    nodoActual = nodoActual.getApuntadorASiguiente();
                }
                
            } while (nodoActual.getApuntadorASiguiente() == null);
            // Itero mientras no este en el ultimo nodo.
        }
    }

    public void imprimir() {
        Alumno nodoActual = primerElemento;
        while (nodoActual != null) {
            System.out.print( nodoActual.getNombreCompleto() + " -> ");
            nodoActual = nodoActual.getApuntadorASiguiente();
        }
        System.out.println( " |. ");
    }

    public int getTamanio() {
        return tamanio;
    }
}