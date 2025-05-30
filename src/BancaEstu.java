public class BancaEstu {
    public static void main(String[] args) {
        Cuenta miAhorro=new Cuenta();
        miAhorro.depositar(2000);
        miAhorro.retirar(500);
        System.out.println(miAhorro.saldo);


        CuentaCredito miCredito=new CuentaCredito(5000, 0.24);
        miCredito.usarCredito(3500);
        System.out.println(miCredito.saldo);
        miCredito.corte();
        System.out.println(miCredito.aPagar);
    }
}
