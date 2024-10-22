public class Lista {
    Nodo Primero;
    Nodo Ultimo;
    int tam;
    public Lista(){
        tam=0;
        Primero=null;
        Ultimo=null;
    }
    //Insertar
    public void insertaralfinal(int dato){
        Nodo aux=new Nodo(dato);
        if(tam==0){
            Primero=aux;
        }else{
            Ultimo.enlace=aux;
            aux.enlace=Primero;
        }
        Ultimo=aux;
        tam++;
    }
    //mostrar
    public void mostrar(){
        Nodo aux=Primero;
        for(int i=0;i<tam;i++){
            System.out.println(aux.info);
            aux=aux.enlace;
        }
    }
}
