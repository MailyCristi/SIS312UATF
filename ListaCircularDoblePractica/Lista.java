public class Lista {
    Nodo Principal;
    Nodo ultimo;
    int tam;
    //indica que valores va a tener cuando se cree la lista
    public Lista(){
        tam=0;
        Principal=null;
        ultimo=null;
    }
    //isEmpty
    public boolean isEmpty(){
        if(tam==0){
            return true;
        }
        return false;
    }

    public void insertarInicio(String nombre, int edad, float nota){
        Nodo aux=new Nodo(nombre, edad, nota);
        if(isEmpty()){
            ultimo=aux;
        }else{
            Principal.anterior=aux;
            aux.siguiente=Principal;
            ultimo.siguiente=aux;
            aux.anterior=ultimo;
        }
        tam++;
        Principal=aux;
    }

    public void insertarfinal(String nombre, int edad, float nota){
        Nodo aux=new Nodo(nombre, edad, nota);
        if(isEmpty()){
            Principal=aux;
        }else{
            Principal.anterior=aux;
            aux.siguiente=Principal;
            ultimo.siguiente=aux;
            aux.anterior=ultimo;
        }
        tam++;
        ultimo=aux;
    }

    public void mostrarID(){
        Nodo aux=Principal;
        Nodo max=null;
        float notamax=0;
        for(int i=0;i<tam*2;i++){
            float nota=aux.nota;
            if(nota>=notamax){
                max=aux;
                notamax=max.nota;
            }
            //System.out.println(max.nota);
            aux=aux.siguiente;
        }
        System.out.println(max.nombre);
    }

    public void eliminarnodo(String nombre){
        Nodo aux=Principal;
        Nodo nodoeliminado=null;
        int notamax=0;
        for(int i=0;i<tam;i++){
            String namenodoaux=aux.nombre;
            int tamaux=namenodoaux.length();
            int tambus=nombre.length();
            if(tamaux==tambus){
                boolean banderita=true;
                for(int j=0;j<tamaux;j++){
                    if(namenodoaux.charAt(j)!=nombre.charAt(j)){
                        banderita=false;
                        break;
                    }
                }
                if(banderita==true){
                    nodoeliminado=aux;
                    break;
                }
            }
            aux=aux.siguiente;
        }
        if(nodoeliminado==null){
            System.out.println("No existe el estudiante");
        }else{
            nodoeliminado.anterior.siguiente=nodoeliminado.siguiente;
            nodoeliminado.siguiente.anterior=nodoeliminado.anterior;
            nodoeliminado.anterior=null;
            nodoeliminado.siguiente=null;
            tam--;
        }
    }
    //Recorrido de toda la Lista
    //Mostrar tamaños de los nombres
    //Depende si el tamaño del nombre es igual al buscado, comparar
    //Si lo encuentra mostrar un hola
    //caso contrario mostrar "No existe"




    //nodoeliminado.anterior.siguiente=nodoeliminado.siguiente;
    //nodoeliminado.siguiente.anterior=nodoeliminado.anterior;
    //nodoeliminado.anterior=null;
    //nodoeliminado.siguiente=null;
    //tam--;

    //constructor
    //insertar
    //mostrar
}
