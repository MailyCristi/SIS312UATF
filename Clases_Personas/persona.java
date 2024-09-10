package Clases_Personas;

public class persona {
    String nombre;
    int edad;
    public persona(String Nombre, int Edad){
        this.nombre=Nombre;
        this.edad=Edad;
    }
    public void saludo(){
        System.out.println("Hola "+nombre+" tu tienes "+edad+"?");
    }
}
