public class Principal {
    public static void main(String[] args) {
        System.out.println("---------------");
        Arbol numeros=new Arbol();

        numeros.insertar(numeros.Padre, 5);
        numeros.insertar(numeros.Padre, 4);
        numeros.insertar(numeros.Padre, 8);
        numeros.insertar(numeros.Padre, 3);
        numeros.insertar(numeros.Padre, 5);
        numeros.insertar(numeros.Padre, 7);
        numeros.insertar(numeros.Padre, 9);

        System.out.println("--------------------------------------");

        numeros.PreOrden(numeros.Padre);
        System.out.println("--------------------------------------");

        numeros.InOrden(numeros.Padre);
        System.out.println("--------------------------------------");

        numeros.PostOrden(numeros.Padre);
    }
}
