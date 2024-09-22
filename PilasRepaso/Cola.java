public class Cola {
    //Primero en entrar primero en salir
    //Ultimo en entrar ultimo en salir
    int vecCola[];
    int cantEntra;
    int cantSale;
    public Cola(int tam){
        vecCola=new int[tam];
        cantEntra=0;
        cantSale=0;
    }
    //esta vacia
    public boolean isEmpty(){
        if(cantSale==cantEntra){
            return true;
        }
        return false;
    }
    //esta llena
    public boolean isFull(){
        if(cantEntra==vecCola.length){
            return true;
        }
        return false;
    }
    //vec->0,1,2,3
    //1,2,3,4
   
    //vec[1]-2
    //vec[2]-3
    //vec[3]-4
    //cantentra->4;
    //cantsale->1;
    //ingresar datos
    public void push(int datos){
        if(!isFull()){
            vecCola[cantEntra]=datos;
            cantEntra++;
        }else{
            System.out.println("La cola ya esta llena");
        }
    }
    //sacar datos
    public int pop(){
        if(!isEmpty()){
            int aux=vecCola[cantSale];
            cantSale++;
            return aux;
        }else{
            System.out.println("La cola ya esta vacia");
            return -1;
        }
    }
    //mostrar el que esta adelante
    public int peek(){
        if(!isEmpty()){
            return vecCola[cantSale];
        }else{
            System.out.println("Ya no existen datos");
            return -1;
        }
    }
}
