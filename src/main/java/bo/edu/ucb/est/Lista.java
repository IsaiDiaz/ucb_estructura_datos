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
           while(nodoActual.getApuntadorASiguiente()!=null){
               nodoActual=nodoActual.getApuntadorASiguiente();
           }
           nodoActual.setApuntadorASiguiente(alumno);
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

    public Alumno obtener(int index){
        Alumno retorno=primerElemento;
        if(index>0) {
            for (int i = 1; i <= index; i++) {
                retorno=retorno.getApuntadorASiguiente();
            }
            return retorno;
        }else{
            return retorno;
        }
    }

    public void eliminar(int index){
        if(index>0){
            Alumno alumno=obtener(index-1);
            Alumno alumno2=obtener(index+1);
            alumno.setApuntadorASiguiente(alumno2);
            tamanio--;
        }else{
            primerElemento=primerElemento.getApuntadorASiguiente();
            tamanio--;
        }
    }
}
