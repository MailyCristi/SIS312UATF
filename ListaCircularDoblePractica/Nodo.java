public class Nodo {
    String nombre;
    int edad;
    float nota;
    Nodo anterior;
    Nodo siguiente;
    public Nodo(String name, int Edad, float notaf){
        this.nombre=name;
        this.edad=Edad;
        this.nota=notaf;
        anterior=null;
        siguiente=null;
    }
}
