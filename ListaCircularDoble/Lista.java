public class Lista {
    Nodo primero;
    Nodo ultimo;
    int tamaño;
    public Lista (){
        primero=null;
        ultimo=null;
        tamaño=0;
    }
    public void insertar(int dato){
        Nodo aux=new Nodo(dato);
        if(tamaño==0){
            primero=aux;
        }else{
            ultimo.posterior=aux;
            aux.anterior=ultimo;

            aux.posterior=primero;
            primero.anterior=aux;
        }
        ultimo=aux;
        tamaño++;
    }
    public void mostrarID(){
        Nodo aux=primero;
        for(int i=0;i<tamaño*2;i++){
            System.out.println(aux.info);
            aux=aux.posterior;
        }
    }
    public void mostrarDI(){
        Nodo aux=ultimo;
        for(int i=0;i<tamaño*2;i++){
            System.out.println(aux.info);
            aux=aux.anterior;
        }
    }

}
