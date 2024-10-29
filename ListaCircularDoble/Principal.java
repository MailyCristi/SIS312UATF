public class Principal {
    public static void main(String[] args) {
        System.out.println();
        Lista numeros=new Lista();
        numeros.insertar(5);
        numeros.insertar(7);
        numeros.insertar(1);
        numeros.insertar(8);
        numeros.mostrarID();
        System.out.println("-----------------------------------");
        numeros.mostrarDI();
    }
}