class Principal{
    public static void main(String[] args) {
        System.out.println("--------------------");
        /*fun(2,6);
        System.out.println(fibonacci(6));
        funcionA(5);
        System.out.println(funci(7845));
        int[] arr={8,2,3,2,5,3,3,4,1,7};
        System.out.println(num(arr,arr.length));*/

        System.out.println(fibonacci(5));
    }

    static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }


    static int num(int[] arr, int n){
        if(n==0){
            return 0;
        }else{
            return arr[n-1]+num(arr,n-1);
        }
    }


    public void torresHanoi(int discos, int torre1, int torre2, int torre3){     
        if (discos==1){
            System.out.println("Mover disco de Torre " + torre1 + " a Torre " + torre3);
        } else {
            torresHanoi(discos-1, torre1, torre3, torre2);
            System.out.println("Mover disco de Torre " + torre1 + " a Torre " + torre3);
            torresHanoi(discos-1, torre2, torre1, torre3);
        }
    }


    public static int funcion5(int[] arr, int n, int target) {
        if (n <= 0) {
            return 0;
        } else if (arr[n - 1] == target) {
            return 1 + funcion5(arr, n - 1, target);
        } else {
            return funcion5(arr, n - 1, target);
        }
    }


    static int funci(int n){
        if(n<10){
            return n;
        }else{
            int x=funci(n/10);
            if(n%10>x){
                return (n%10);
            }
            else
                return x;
        }
    }


    static int fun(int x, int y){
        if(y==0){
            return 1;
        }
        int aux=x*fun(x, y-1);
        System.out.println(aux);
        return aux;
    }
}