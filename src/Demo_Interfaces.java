public class Demo_Interfaces {
    //Implementar la clase abstracta Numero
    //Implementar los metodos de la interfaz Operaciones
    //Crear dos objetos de tipo NumeroConcreto
    //Sumar, restar, multiplicar y dividir los objetos utilizando los métodos
    public static void main(String[] args) {
        NumeroConcreto num1=new NumeroConcreto(100);
        NumeroConcreto num2=new NumeroConcreto(200);
        num1.sumar(num2);
        System.out.println(num1.valor);
    }



}


interface Operaciones{
    public void sumar(Numero otroNumero);
    public void restar(Numero otroNumero);
    public void multiplicar(Numero otroNumero);
    public void divEntera(Numero otroNumero);
}

abstract class Numero implements Operaciones{
    public int valor;
}

class NumeroConcreto extends Numero{
   //int valor

    public NumeroConcreto(int valor) {
        this.valor=valor;
    }

    @Override
    public void sumar(Numero otroNumero) {
        this.valor=this.valor+otroNumero.valor;
    }

    @Override
    public void restar(Numero otroNumero) {
        this.valor=this.valor-otroNumero.valor;
    }

    @Override
    public void multiplicar(Numero otroNumero) {
        this.valor=this.valor*otroNumero.valor;
    }

    @Override
    public void divEntera(Numero otroNumero) {
        this.valor=(int)(this.valor/otroNumero.valor);
    }
}