public class ListaCircularDoble {
    int tam;
    NodoDoble primero;
    NodoDoble ultimo;
    public ListaCircularDoble(){
        tam=0;
        primero=null;
        ultimo=null;
    }
    public void insertarultimo(int dato){
        NodoDoble aux=new NodoDoble(dato);
        if(tam==0){
            primero=aux;
        }else{
            ultimo.posterior=aux;
            aux.posterior=primero;
            primero.anterior=aux;
            aux.anterior=ultimo;
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
            ultimo.posterior=aux;
            aux.anterior=ultimo;
        }
        primero=aux;
        tam++;
    }

    public void mostrarID(){
        NodoDoble aux=primero;
        for(int i=0;i<tam*2;i++){
            System.out.println(aux.info);
            aux=aux.posterior;
        }
    }

    public void mostrarDI(){
        NodoDoble aux=ultimo;
        for(int i=0;i<tam*2;i++){
            System.out.println(aux.info);
            aux=aux.anterior;
        }
    }
}
