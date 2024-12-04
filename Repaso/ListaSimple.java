public class ListaSimple {
    int tam;
    Nodo Primero;
    Nodo Ultimo;
    public ListaSimple(){
        tam=0;
        Primero=null;
        Ultimo=null;
    }
    public void insertar(int dato){
        Nodo aux=new Nodo(dato);
        if(tam==0){
            Primero=aux;
        }else{
            Ultimo.enlace=aux;
        }
        Ultimo=aux;
        tam++;
    }
    public void mostrar(){
        Nodo aux=Primero;
        while(aux!=null){
            System.out.println(aux.info);
            aux=aux.enlace;
        }
    }

    public void eliminarultimo(){
        Nodo aux=Primero;
        while(aux.enlace!=Ultimo){
            aux=aux.enlace;
        }
        aux.enlace=null;
        System.out.println("Dato Eliminado");
    }
}
