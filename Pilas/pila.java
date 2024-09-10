package Pilas;

public class pila{

    int tam;
    int[] pilast;
    public pila(int TAM){
        pilast=new int[TAM];
        tam=0;
    }
    public boolean isEmpty(){
        if(tam==0){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(tam==pilast.length){
            return true;
        }
        return false;
    }

    public void push(int num){
        if(isFull()==true){
            System.out.println("La pila ya esta llena");
        }else{
            pilast[tam]=num;
            tam++;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Ya no existen datos");
            return -1;
        }else{
            tam--;
            return pilast[tam];
        }
    }
    
    public int peek(){
        return pilast[tam-1];
    }
}
