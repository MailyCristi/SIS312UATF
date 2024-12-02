public class Principal {
    public static void main(String[] args) {
        System.out.println("------------------------");
        Arbol numeros= new Arbol();
        numeros.insertar(8, numeros.raiz);
        numeros.insertar(5, numeros.raiz);
        numeros.insertar(10, numeros.raiz);
        numeros.insertar(2, numeros.raiz);
        numeros.insertar(7, numeros.raiz);
        numeros.insertar(9, numeros.raiz);
        numeros.insertar(11, numeros.raiz);
        numeros.insertar(1, numeros.raiz);
        numeros.insertar(9, numeros.raiz);
        System.out.println("------------------------");
        //numeros.PreOrden(numeros.raiz);

        System.out.println("------------------------");
        //numeros.InOrden(numeros.raiz);

        System.out.println("------------------------");
        //numeros.PostOrden(numeros.raiz);

        System.out.println("Orden: "+ numeros.Orden(numeros.raiz));
        numeros.Complete(numeros.raiz);
    }
}
