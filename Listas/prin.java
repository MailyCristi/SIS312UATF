public class prin {
    public static void main(String[] args) {
        Lista numero=new Lista();
        Persona x=new Persona("Susana", 20);
        Persona y=new Persona("Pepito", 18);
        Persona z=new Persona("Lian", 19);
        Persona a=new Persona("Pedro", 20);
        Persona b=new Persona("Jose", 25);
        numero.insertar(x);
        numero.insertar(y);
        numero.insertar(z);
        numero.insertar(a);
        numero.insertar(b);
        
        numero.mostrar();

    }
}
