public class DemoLanzarExcepcion {
    public static void main(String[] args) throws Exception {
        int a=10;
        int b=2;
        if(b==0)
            throw new MiExcepcion();
        else{
            int div=a/b;
            System.out.println(div);
        }
    }
}


class MiExcepcion extends Exception{
    public MiExcepcion(){
        super("Esta es mi propia excepción");
    }
}