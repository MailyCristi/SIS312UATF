public class Arbol {
    Nodo Padre;
    int tam;
    public Arbol(){
        tam=0;
        Padre=null;
    }
    //Insertar
    public void insertar(Nodo Inicio, int dato){
        Nodo aux=new Nodo(dato);
        if(Padre==null){
            Padre=aux;
        }else{
            if(dato>Inicio.info){
                //derecha
                System.out.println("El nodo: "+dato+", Es mayor al padre "+ Inicio.info);
                if(Inicio.derecha==null){
                    //Vacio ese lado
                    Inicio.derecha=aux;
                    System.out.println("Nodo "+ Inicio.derecha.info + " fue ingresado a la derecha del nodo " + Inicio.info);
                }else{
                    //Existe un nodo
                    insertar(Inicio.derecha, dato);
                }
            }else{
                //izquierda
                System.out.println("El nodo: "+dato+", Es menor o igual al padre "+ Inicio.info);
                if(Inicio.izquierda==null){
                    //Vacio
                    Inicio.izquierda=aux;
                    System.out.println("Nodo "+ Inicio.izquierda.info + " fue ingresado a la izquierda del nodo " + Inicio.info);
                }else{
                    //Ya existe un nodo
                    insertar(Inicio.izquierda, dato);
                }
            }
        }
        tam++;
    }
    //Mostrar -> PreOrden

    public void PreOrden(Nodo inicial){
        if(inicial==null){
            return;
        }
        System.out.println(inicial.info);
        PreOrden(inicial.izquierda);
        PreOrden(inicial.derecha);
    }
    //Mostrar -> InOrden

    public void InOrden(Nodo inicial){
        if(inicial==null){
            return;
        }
        
        InOrden(inicial.izquierda);
        System.out.println(inicial.info);
        InOrden(inicial.derecha);
    }
    //Mostrar -> PostOrden

    public void PostOrden(Nodo inicial){
        if(inicial==null){
            return;
        }
        
        PostOrden(inicial.izquierda);
        PostOrden(inicial.derecha);
        System.out.println(inicial.info);
    }

    //Peso?
    //Mostrar Hojas
    //Mostrar Ramas
    //Preguntar si esta lleno o no?
}
