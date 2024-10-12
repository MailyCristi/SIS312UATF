public class Lista {
    Nodo primero;
    Nodo ultimo;
    int tam;
    public Lista(){
        tam=0;
        primero=null;
        ultimo=null;
    }
    public void insertar(int dato){
        Nodo aux=new Nodo(dato);
        if(tam==0){
            primero=aux;
        }else{
            ultimo.posterior=aux;
            aux.anterior=ultimo;
        }
        ultimo=aux;
        tam++;
    }
    public void mostrarID(){
        Nodo aux=primero;
        while(aux!=null){
            System.out.println(aux.info);
            aux=aux.posterior;
        }
    }
    public void mostrarDI(){
        Nodo aux=ultimo;
        while(aux!=null){
            System.out.println(aux.info);
            aux=aux.anterior;
        }
    }
}
