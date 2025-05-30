public class BoletaDeCalificaciones {
    String nombre;
    double calif_fundProg;
    double calif_etica;
    double calif_mateDisc;
    double calif_admon;
    double calif_fundInve;
    double calif_tutorias;
    double calif_calcDif;

    double calcula_promedio(){
        return (calif_fundProg+calif_etica+calif_mateDisc+calif_admon+calif_fundInve+calif_tutorias+calif_calcDif)/7;
    }

    String obtenerDatos(){
        String cad="";
        cad=cad+"serializacion.Alumno{nombre:"+nombre+"; ";
        cad=cad+"Fund. Programación:"+calif_fundProg+"; ";
        cad=cad+"Ética:"+calif_etica+"; ";
        cad=cad+"Mate. Discretas:"+calif_mateDisc+"; ";
        cad=cad+"Administración:"+calif_admon+"; ";
        cad=cad+"Fund. Investigación:"+calif_fundInve+"; ";
        cad=cad+"Tutorias:"+calif_tutorias+"; ";
        cad=cad+"Calc. Diferencial:"+calif_calcDif+"; ";
        return cad;
    }
}
