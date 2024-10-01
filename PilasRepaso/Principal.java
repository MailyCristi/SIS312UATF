import java.util.*;
class Principal{
    public static void main(String [] args){
        Scanner i=new Scanner(System.in);
        int n=i.nextInt();

        Cola edades=new Cola(n);
        Pila numeros=new Pila(n);

        System.out.println("Introducir datos");

        while (!edades.isFull()) {
            int aux=i.nextInt();
            edades.push(aux);
            numeros.push(aux);
        }

        System.out.println("------------------Colas-----------------------");

        while (!edades.isEmpty()){
            System.out.println(edades.pop());
        }

        System.out.println("------------------Pilas-----------------------");

        while (!numeros.isEmpty()) {
            System.out.println(numeros.pop());
        }
    }
}