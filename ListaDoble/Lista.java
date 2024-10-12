public class Lista {
    Nodo principal;
    Nodo ultimo;
    int tam;
    public Lista(){
        tam=0;
        principal=null;
        ultimo=null;
    }
    public void insertar(int dato){
        Nodo aux=new Nodo(dato);
        if(tam==0){
            principal=aux;
        }else{
            ultimo.enlacePosterior=aux;
            aux.enlaceanterior=ultimo;
        }
        ultimo=aux;
        tam++;
    }
    public void mostrarID(){
        Nodo aux=principal;
        while(aux!=null){
            System.out.println(aux.info);
            aux=aux.enlacePosterior;
        }
    }
    public void mostrarDI(){
        Nodo aux=ultimo;
        while(aux!=null){
            System.out.println(aux.info);
            aux=aux.enlaceanterior;
        }
    }
}
