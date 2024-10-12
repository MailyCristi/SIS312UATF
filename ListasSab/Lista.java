public class Lista {
    Nodo principal;
    Nodo ultimo;
    int tam;
    public Lista(){
        tam=0;
        Nodo ultimo=null;
        Nodo principal=null;
    }
    //insertar datos
    public void insertar(int datos){
        Nodo aux=new Nodo(datos);
        if(tam==0){
            principal=aux;
        }else{
            ultimo.enlace=aux;
        }
        ultimo=aux;
        tam++;
    }
    //mostrar datos
    public void mostrar(){
        Nodo aux=principal;
        while(aux!=null){
            System.out.println(aux.info);
            aux=aux.enlace;
        }
    }
}
