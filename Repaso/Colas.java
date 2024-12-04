public class Colas {
    int vec [];
    int datosIngresados;
    int datosSalidos;
    public Colas (int tam){
        vec=new int[tam];
        this.datosIngresados=0;
        this.datosSalidos=0;
    }
    //IsEmpty
    public boolean IsEmpty(){
        if(datosIngresados==datosSalidos){
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
            vec[datosIngresados]=dato;
            datosIngresados++;
        }else{
            System.out.println("La cola ya esta llena");
        }
    }
    //Pop
    public int pop(){
        if(!IsEmpty()){
            datosSalidos++;
            return vec[datosSalidos-1];
        }else{
            System.out.println("La cola ya esta vacia");
            return -1;
        }
    }
    //Peek
    public int peek(){
        if(!IsEmpty()){
            return vec[datosSalidos];
        }else{
            System.out.println("La cola ya esta vacia");
            return -1;
        }
    }
}
