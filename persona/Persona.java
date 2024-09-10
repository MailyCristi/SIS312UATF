package persona;
class Persona{
    String NOMBRE;
    String APELLIDO;
    int EDAD;
    public Persona(String nombre, String apellido, int edad){
        this.NOMBRE=nombre;
        this.APELLIDO=apellido;
        this.EDAD=edad;
    }

    public void mensaje(){
        System.out.println("Hola "+NOMBRE+" "+APELLIDO);
    }

    public void futuro(){
        int aux=EDAD;
        aux=aux+5;
        System.out.println("Tu edad en 5 años sera: "+aux);
    }

    public void name(){
        System.out.println(NOMBRE);
    }
}