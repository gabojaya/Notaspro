public class MayorNumero {
   public static void main(String[] args) {
        int a = 20, b = 30, m;
        if(a>b){
            System.out.println("El mayor es "+a);
        }else{
            if(a==b){
                System.out.println("Son iguales");
            }else{
                System.out.println("El mayor es "+b);}
            }
        
        m = (a>b)? a:b;
        System.out.println("El valor de m es "+ m);

        if(a==b){
            System.out.println("Son iguales");
        }
        if(a>b){
            System.out.println("El mayor es "+a);
        }
        if(b>a){
            System.out.println("El mayor es "+a);

        }
    }
}
