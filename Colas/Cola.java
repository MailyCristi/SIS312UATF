public class Cola {
    int vec[];
    int tam;
    int datingresados;
    int datsacados;
    public Cola(int n){
        this.tam=n;
        vec=new int[n];
        datingresados=0;
        datsacados=0;
    }
    //Esta vacio?
    public boolean isEmpty(){
        if(datsacados==datingresados){
            return true;
        }
        return false;
    }
    //Esta lleno?
    public boolean isFull(){
        if(datingresados==vec.length){
            return true;
        }
        return false;
    }
    //Ingresar datos
    public void push(int dato){
        if(!isFull()){
            vec[datingresados]=dato;
            datingresados++;
        }else{
            System.out.println("La cola ya esta llena");
        }
    }
    //Sacar datos
    public int pop(){
        if(!isEmpty()){
            datsacados++;
            return vec[datsacados-1];
        }else{
            System.out.println("La cola ya esta vacia");
            return -1;
        }
    }
    //Mostrar el que esta al inicio
    public int peek(){
        if(!isEmpty()){
            return vec[datsacados];
        }else{
            System.out.println("La cola ya esta vacia");
            return -1;
        }
    }
}
