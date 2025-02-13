public class MainBoletaDeCalificaciones {
    public static void main(String[] args) {
        BoletaDeCalificaciones a1=new BoletaDeCalificaciones();

        //Configurar el objeto dando valores a sus atributos
        a1.nombre="Fabrizzio";
        a1.calif_fundProg=88.0;
        a1.calif_etica=99.0;
        a1.calif_mateDisc=93.0;
        a1.calif_admon=95.0;
        a1.calif_fundInve=100.0;
        a1.calif_tutorias=100.0;
        a1.calif_calcDif=92.0;

        System.out.println(a1.obtenerDatos());

        BoletaDeCalificaciones a2=new BoletaDeCalificaciones();

        a2.nombre="Javier";
        a2.calif_fundProg=85.0;
        a2.calif_etica=99.0;
        a2.calif_mateDisc=90.0;
        a2.calif_admon=97.0;
        a2.calif_fundInve=100.0;
        a2.calif_tutorias=95.0;
        a2.calif_calcDif=95.0;

        System.out.println(a2.obtenerDatos());

        BoletaDeCalificaciones a3=new BoletaDeCalificaciones();

        a3.nombre="Ernesto";
        a3.calif_fundProg=70.0;
        a3.calif_etica=90.0;
        a3.calif_mateDisc=75.0;
        a3.calif_admon=95.0;
        a3.calif_fundInve=100.0;
        a3.calif_tutorias=80.0;
        a3.calif_calcDif=70.0;

        System.out.println(a3.obtenerDatos());

        System.out.println(a1.calcula_promedio());
        System.out.println(a2.calcula_promedio());
        System.out.println(a3.calcula_promedio());
    }
}
