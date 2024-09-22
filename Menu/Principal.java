package Menu;

import java.util.*;
public class Principal {
    public static void main(String[] args) {
        Scanner ie=new Scanner(System.in);
        //int n=ie.nextInt();
        Colas Datos=new Colas(100);

        while(true){
            mostrar();
            int opcion=ie.nextInt();
            switch (opcion) {
                case 1:
                    mostrar();
                    break;
                case 2:
                    System.out.println("Insertando nueva persona");
                    System.out.print("Introduzca su nombre: ");
                    String name=ie.next();

                    System.out.println();
                    System.out.print("Introduzca su edad: ");
                    int age=ie.nextInt();

                    System.out.println();
                    Persona nuevo=new Persona(name, age);

                    Datos.push(nuevo);

                    break;
                case 3:
                    Persona retorno=Datos.pop();

                    System.out.println("Se elimino a la persona: "+retorno.Nombre);
                    break;
                case 4:
                    System.out.println(Datos.cuantaspersonas());
                    break;
                case 5:
                    System.out.println(Datos.isFull());
                    break;
                case 6:
                    System.out.println(Datos.isEmpty());
                    break;
                default:
                    System.out.println("Opcion invalida, gracias por participar");
                    break;
            }
        }
    }
    static void mostrar(){
        System.out.println("1. Ver menu");
        System.out.println("2. Insertar una Persona");
        System.out.println("3. Eliminar persona");
        System.out.println("4. Verificar Cuantas persons quedan en la cola");
        System.out.println("5. Verificar si la cola esta llena");
        System.out.println("6. Verificar si la cola esta vacia");
    }
}
