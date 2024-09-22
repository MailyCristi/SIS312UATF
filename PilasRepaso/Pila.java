public class Pila {
    //primero que entra es el ultimo en salir,
    //primero en salir es el ultimo en entrar,
    int vecPila[];
    int cant;
    int tam;
    public Pila(int tamaño){
        vecPila=new int[tamaño];
        cant=0;
        this.tam=tamaño;
    }
    //Esta vacio
    public boolean isEmpty(){
        if(cant==0){
            return true;
        }
        return false;
    }
    //Esta lleno
    public boolean isFull(){
        if(cant==vecPila.length){
            return true;
        }
        return false;
    }
    //introducir datos
    //8,3,5,9,
    //vec->0,1,2,3
    //vec[0]->8;
    //vec[1]->3
    //vec[2]->5
    //vec[3]->9
    //cant->4
    public void push(int datos){
        if(!isFull()){
            vecPila[cant]=datos;
            cant++;
        }else{
            System.out.println("La pila ya esta llena");
        }
    }
    //sacar datos
    public int pop(){
        if(!isEmpty()){
            cant--;
            return vecPila[cant];
        }else{
            System.out.println("La pila ya esta vacia");
            return -1;
        }
    }
    //mostrar el que esta encima
    public int peek(){
        if(!isEmpty()){
            return vecPila[cant-1];
        }else{
            System.out.println("La pila ya no tiene datos");
            return -1;
        }
    }
}
