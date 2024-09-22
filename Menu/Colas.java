package Menu;

public class Colas {
    Persona vecCola[];
    int cantEntra;
    int cantSale;
    public Colas(int tam){
        vecCola=new Persona[tam];
        cantEntra=0;
        cantSale=0;
    }
    public boolean isEmpty(){
        if(cantSale==cantEntra){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(cantEntra==vecCola.length){
            return true;
        }
        return false;
    }
    public void push(Persona datos){
        if(!isFull()){
            vecCola[cantEntra]=datos;
            cantEntra++;
        }else{
            System.out.println("La cola ya esta llena");
        }
    }
    public Persona pop(){
        if(!isEmpty()){
            Persona aux=vecCola[cantSale];
            cantSale++;
            return aux;
        }else{
            System.out.println("La cola ya esta vacia");
            Persona nulo=new Persona(null, -1);
            return nulo;
        }
    }
    public Persona peek(){
        if(!isEmpty()){
            return vecCola[cantSale];
        }else{
            System.out.println("Ya no existen datos");
            Persona nulo=new Persona(null, -1);
            return nulo;
        }
    }
    public int cuantaspersonas(){
        int aux=cantEntra-cantSale;
        return aux;
    }
}
