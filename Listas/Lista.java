public class Lista {
    Nodo Principal;
    Nodo ultimo;
    int tam;
    public Lista(){
        tam=0;
        ultimo=null;
    }
    public void insertar(Persona dato){
        Nodo aux=new Nodo(dato);
        if(tam==0){
            Principal=aux;
        }else{
            ultimo.enlace=aux;
        }
        ultimo=aux;
        tam++;
    }
    public void mostrar(){
        Nodo aux=Principal;
        while(aux!=null){
            System.out.println(aux.info.Nombre+"   "+aux.info.edad);
            aux=aux.enlace;
        }
    }
}
