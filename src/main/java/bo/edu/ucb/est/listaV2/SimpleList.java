package bo.edu.ucb.est.listaV2;

public class SimpleList <T>{
    private Node first;
    private int size;

    public SimpleList() {
        first = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(T data) {
        Node node = new Node(data, null);
        size++;
        if (first == null) {
            first = node;
        } else {
            for (Node current = first ; current != null; current = current.getNext() ) {
                if (current.getNext() == null ) { // es el ultimo nodo
                    current.setNext(node); // Enlazo el ultimo nodo.
                    break;
                }
            }
        }
    }

    public void print() {
        for (Node current = first; current != null ; current = current.getNext()) {
            System.out.print( current.getData() + " -> ");
        }
        System.out.println(" |. ");
    }
   /* public Node getData(T data){
        Node ret= null;
        for (ret = first ; ret.getNext()!=null; ret = ret.getNext()) {
            if(data==ret.getData()) {
                return ret;
            }
        }
        return ret;
    }*/

    public Node getData(int i){//obtener un elemento
        Node ret = first;
        if(i>0) {
            for (int j = 1; j <= i; j++) {
                ret=ret.getNext();
            }
            return ret;
        }else{
            return ret;
        }
    }
    public boolean contains(T data){// Retorna true si la lista contiene el elemento.
        boolean flag=false;
        Node aux = first;
        while(flag==false && aux.getNext()!=null){
            if(aux.getData()==data){
                flag=true;
            }else{
                aux= aux.getNext();
            }
        }
        return flag;
    }
     public boolean remove(T data){  // Remueve el elemento
        Node fi = null;
        Node da = null;
        boolean re= false;
        if(contains(data)){
            for(Node ret=first;ret.getNext()!=null;ret=ret.getNext()){
                if(data==ret.getData()){
                    fi= ret ;
                    break;
                }
            }
            for(Node ret1=first;ret1.getNext()!=null;ret1=ret1.getNext()){
                if(fi== ret1.getNext()){
                    da=ret1.getNext();
                    break;
                }
            }
            if(da==null){
                first=null;
            }else{
                da.setNext(fi.getNext());
                re = true;
            }
            return re;
        }else{
            return re;
        }
     }
     public boolean remove(int i){// Remueve el elemento de la posicion i especifgicada.
        boolean r=false;
        Node b=getData(i);
        Node an=getData(i-1);
        if(b==null){
            r=false;
        }else{
            an.setNext(b.getNext());
            r=true;
        }
        return r;
     }

}
