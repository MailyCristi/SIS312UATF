public class ListaEnlazada {
    Nodo cabeza;
    int tam;
    public ListaEnlazada(){
        tam=0;
        cabeza=null;
    }
    public void insertarinicio(int dato){
        Nodo aux=new Nodo(dato);
        if(tam==0){
            cabeza=aux;
        }else{
            aux.siguiente=cabeza;
            cabeza=aux;
        }
        tam++;
    }

    public void insertarfinal(int dato){
        Nodo aux=new Nodo(dato);
        if(tam==0){
            cabeza=aux;
        }else{
            Nodo ult=cabeza;
            while(ult.siguiente!=null){
                ult=ult.siguiente;
            }
            ult.siguiente=aux;
        }
        tam++;
    }

    public void eliminarcabeza(){
        Nodo aux=cabeza.siguiente;
        cabeza.siguiente=null;
        cabeza=aux;
    }

    public void eliminarcola(){
        Nodo primero=cabeza;
        Nodo segundo=primero.siguiente;
        while(segundo.siguiente!=null){
            primero=primero.siguiente;
            segundo=segundo.siguiente;
        }
        primero.siguiente=null;
    }

    public void mostrar(){
        Nodo aux=cabeza;
        while (aux!=null) {
            System.out.println(aux.dato);
            aux=aux.siguiente;
        }
    }
}
