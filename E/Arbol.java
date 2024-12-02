public class Arbol {
    Nodo raiz;
    public Arbol(){
        raiz=null;
    }
    public void insertar(int dato, Nodo padre){
        if(raiz==null){
            Nodo aux=new Nodo(dato);
            raiz=aux;
        }else{
            if(dato>padre.info){
                if(padre.derecha==null){
                    Nodo aux=new Nodo(dato);
                    padre.derecha=aux;
                }else{
                    insertar(dato, padre.derecha);
                }
            }else{
                if(padre.izquierda==null){
                    Nodo aux=new Nodo(dato);
                    padre.izquierda=aux;
                }else{
                    insertar(dato, padre.izquierda);
                }
            }
        }
    }
    public void PreOrden(Nodo padre){
        if(padre==null){
            return;
        }
        System.out.println(padre.info);
        PreOrden(padre.izquierda);
        PreOrden(padre.derecha);
    }

    public void InOrden(Nodo padre){
        if(padre==null){
            return;
        }
        InOrden(padre.izquierda);
        System.out.println(padre.info);
        InOrden(padre.derecha);
    }

    public void PostOrden(Nodo padre){
        if(padre==null){
            return;
        }
        PostOrden(padre.izquierda);
        PostOrden(padre.derecha);
        System.out.println(padre.info);
    }

    public int Orden(Nodo padre){
        if(padre==null){
            return 0;
        }
        return padre.info + Orden(padre.izquierda) + Orden(padre.derecha);
    }

    public void Complete(Nodo padre){
        if(padre==null){
            return;
        }
        if(padre.izquierda!=null && padre.derecha!=null){
            Complete(padre.izquierda);
            Complete(padre.derecha);
        }else{
            System.out.println("No esta lleno");
            return;
        }
    }

    public void Hojas(Nodo padre){
        if(padre==null)
            return;
        if(padre.izquierda==null && padre.derecha==null)
            System.out.println(padre.info);
        //System.out.println(padre.info);
        Hojas(padre.izquierda);
        Hojas(padre.derecha);
    }

}
