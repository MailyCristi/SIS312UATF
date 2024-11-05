public class Principal {
    public static void main(String[] args) {
        System.out.println("-------------------");
        ListaEnlazada numeros=new ListaEnlazada();
        numeros.insertarinicio(5);
        numeros.insertarfinal(3);
        numeros.insertarinicio(2);
        numeros.insertarfinal(8);
        //2->5->3->8
        numeros.mostrar();
        System.out.println("--------------------------");
        numeros.eliminarcabeza();
        numeros.mostrar();

        System.out.println("--------------------------");
        numeros.eliminarcola();
        numeros.mostrar();
    }
}
