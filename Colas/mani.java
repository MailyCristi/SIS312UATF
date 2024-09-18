public class mani {
    public static void main(String[] args){
        System.out.println("abc");
        Cola nuevo=new Cola(3);

        System.out.println(nuevo.isEmpty());
        System.out.println(nuevo.isFull());

        nuevo.push(5);
        nuevo.push(3);
        nuevo.push(8);

        System.out.println(nuevo.pop());
        System.out.println(nuevo.pop());
        System.out.println(nuevo.pop());

    }
}