package persona;
    class hola{
        public static void main(String[] args) {
            System.out.println("Holamundo");
            Persona nuevo=new Persona("Pedro", "Leon", 20);

            nuevo.mensaje();
            nuevo.futuro();
            nuevo.name();
        }
    }

