package Pilas;

public class mani {
    public static void main(String[] args){
        pila numeros=new pila(3);
        System.out.println(numeros.isEmpty());
        System.out.println(numeros.isFull());

        numeros.push(5);
        numeros.push(3);
        numeros.push(8);
        numeros.push(0);

        System.out.println(numeros.peek());
        System.out.println(numeros.pop());

        System.out.println(numeros.peek());
        System.out.println(numeros.pop());

        System.out.println(numeros.peek());
        System.out.println(numeros.pop());
    }
}
