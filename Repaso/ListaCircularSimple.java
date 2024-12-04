public class ListaCircularSimple {
    int tam;
    Nodo primero;
    Nodo ultimo;
    public ListaCircularSimple(){
        tam=0;
        primero=null;
        ultimo=null;
    }
    public void insertar(int dato){
        Nodo aux=new Nodo(dato);
        if(tam==0){
            primero=aux;
        }else{
            ultimo.enlace=aux;
            aux.enlace=primero;
        }
        ultimo=aux;
        tam++;
    }
    public void mostrar(){
        Nodo aux=primero;
        for(int i=0;i<tam*2;i++){
            System.out.println(aux.info);
            aux=aux.enlace;
        }
    }
}
