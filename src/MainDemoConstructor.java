public class MainDemoConstructor {
    public static void main(String[] args) {
        //Aquí estas invocando al constructor
        DemoConstructores_01 obj = new DemoConstructores_01();
        System.out.println(obj.atributo1);
        obj.atributo1="Nuevo valor";
        System.out.println(obj.atributo1);

        DemoConstructores_01 obj2=new DemoConstructores_01("Este es mi valor");
        System.out.println(obj2.atributo1);


        DemoConstructores_01 obj3=new DemoConstructores_01(20, "Valor");
    }
}
