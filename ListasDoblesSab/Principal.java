public class Principal {
    public static void main(String[] args) {
        System.out.println();
        Lista numeros=new Lista();

        numeros.insertar(5);
        numeros.insertar(8);
        numeros.insertar(3);

        numeros.mostrarDI();
        System.out.println();
        numeros.mostrarID();
    }
}
