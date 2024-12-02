public class Principal {
    public static void main(String[] args) {
        System.out.println("---------------");
        Arbol numeros=new Arbol();

        numeros.insertar(numeros.Padre, 50);
        numeros.insertar(numeros.Padre, 30);
        numeros.insertar(numeros.Padre, 70);
        numeros.insertar(numeros.Padre, 20);
        numeros.insertar(numeros.Padre, 40);
        numeros.insertar(numeros.Padre, 60);
        numeros.insertar(numeros.Padre, 80);
        numeros.insertar(numeros.Padre, 10);
        numeros.insertar(numeros.Padre, 90);

        System.out.println("--------------------------------------");

        numeros.PreOrden(numeros.Padre);
        System.out.println("--------------------------------------");

        numeros.InOrden(numeros.Padre);
        System.out.println("--------------------------------------");

        numeros.PostOrden(numeros.Padre);


        //System.out.println(numeros.buscando(numeros.Padre,150));
        //System.out.println(numeros.contando(numeros.Padre));
    }
}
