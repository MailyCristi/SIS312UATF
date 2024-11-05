public class Principal {

    public static void main(String[] args) {
        System.out.println("-------------------------------");
        Lista estudiantes=new Lista();
        estudiantes.insertarfinal("Pedro", 15, 20);
        estudiantes.insertarfinal("Susana", 15, 50);
        estudiantes.insertarfinal("Juan", 15, 80);
        estudiantes.insertarfinal("Luisa", 15, 10);
        estudiantes.insertarfinal("Ana", 15, 25);
        estudiantes.mostrarID();
        System.out.println("-------------------------------");
        estudiantes.eliminarnodo("Juan");
        estudiantes.mostrarID();
        System.out.println("-------------------------------");
        estudiantes.eliminarnodo("Luisa");
        estudiantes.mostrarID();
        //estudiantes.eliminarnodo("Juan");
        //estudiantes.eliminarnodo("Maria");
    }
}