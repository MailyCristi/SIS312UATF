public class ListaDoble {
    int tam;
    NodoDoble primero;
    NodoDoble ultimo;
    public ListaDoble(){
        tam =0;
        primero=null;
        ultimo=null;
    }
    public void insertarFinal(int dato){
        NodoDoble aux=new NodoDoble(dato);
        if(tam==0){
            primero=aux;
        }else{
            aux.anterior=ultimo;
            ultimo.posterior=aux;
        }
        ultimo=aux;
        tam++;
    }

    public void insertarinicio(int dato){
        NodoDoble aux=new NodoDoble(dato);
        if(tam==0){
            ultimo=aux;
        }else{
            primero.anterior=aux;
            aux.posterior=primero;
        }
        primero=aux;
        tam++;
    }

    public void mostrarID(){
        NodoDoble aux=primero;
        while(aux!=null){
            System.out.println(aux.info);
            aux=aux.posterior;
        }
    }

    public void mostrarDI(){
        NodoDoble aux=ultimo;
        while(aux!=null){
            System.out.println(aux.info);
            aux=aux.anterior;
        }
    }
}
