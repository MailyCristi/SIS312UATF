public class Pilas {
    int [] vec;
    int datosIngresados;
    public Pilas(int tam){
        this.datosIngresados=0;
        vec=new int[tam];
    }
    //IsEmpty
    public boolean IsEmpty(){
        if(datosIngresados==0){
            return true;
        }
        return false;
    }
    //IsFull
    public boolean IsFull(){
        if(datosIngresados==vec.length){
            return true;
        }
        return false;
    }
    //Push
    public void push(int dato){
        if(!IsFull()){
            //Puedo ingresar
            vec[datosIngresados]=dato;
            datosIngresados++;
        }else{
            //No puedo ingresar
            System.out.println("La pila esta llena");
        }
    }
    //Pop
    public int pop(){
        if(!IsEmpty()){
            //Puedo sacar
            datosIngresados--;
            return vec[datosIngresados];
        }else{
            System.out.println("La pila ya esta vacia");
            return -1;
            //No puedo sacar
        }
    }
    //Peek
    public int peek(){
        if(!IsEmpty()){
            return vec[datosIngresados-1];
        }else{
            System.out.println("La pila ya esta vacia");
            return -1;
        }
    }
}
