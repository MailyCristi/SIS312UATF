import java.util.*;
public class Principal{
    public static void main(String[] args) {
        System.out.println("---------------");
        Scanner ie=new Scanner(System.in);
        Pilas numeros=new Pilas(10);
        Colas numeritos=new Colas(10);
        boolean bandera=true;
        ListaSimple list=new ListaSimple();
        ListaDoble newlist=new ListaDoble();
        ListaCircularSimple circulo=new ListaCircularSimple();
        ListaCircularDoble circulodoble=new ListaCircularDoble();
        circulodoble.insertarinicio(7);
        circulodoble.insertarultimo(3);
        circulodoble.insertarultimo(2);
        circulodoble.insertarinicio(1);

        circulodoble.mostrarID();
        System.out.println("---------------");
        circulodoble.mostrarDI();
        
        /*while(bandera){
            menu();
            int opcion=ie.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Inserte un valor: ");
                    int aux=ie.nextInt();
                    numeros.push(aux);
                break;
                case 2:
                    System.out.println("El que esta encima es: "+ numeros.peek());
                break;
                case 3:
                    numeros.pop();
                    System.out.println("Se retiro el dato correctamente.");
                break;
                case 4:
                    System.out.println("Inserte un valor: ");
                    int aux2=ie.nextInt();
                    numeritos.push(aux2);
                break;
                case 5:
                    System.out.println("El que esta encima es: "+ numeritos.peek());
                break;
                case 6:
                    numeritos.pop();
                    System.out.println("Se retiro el dato correctamente.");
                break;
                case 7:
                    bandera=false;
                break;
                case 8:
                    System.out.print("Ingrese un valor: ");
                    int auxlist=ie.nextInt();
                    list.insertar(auxlist);
                break;
                case 9:
                    list.mostrar();
                 break;
                case 10:
                    list.eliminarultimo();
                break;
                default:
                    System.out.println("Opcion no valida");
                break;
            }
        }*/




    }



    static void menu(){
        System.out.println("1. Insertar a la pila");
        System.out.println("2. Quien esta encima de la pila");
        System.out.println("3. Sacar de la pila");
        System.out.println("4. Insertar a la cola");
        System.out.println("5. Quien esta encima de la cola");
        System.out.println("6. Sacar de la cola");
        System.out.println("7. Finalizar el programa");
        System.out.println("8. Insertar en la lista");
        System.out.println("9. mostrar la lista");
        System.out.println("10. Eliminar ultimo nodo");
    }
}