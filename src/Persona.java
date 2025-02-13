public class Persona {
    String nombre;
    int edad;
    double estatura;
    double peso;
    String genero;

    double calcula_imc(){
        return peso/(estatura*estatura);
    }

    String obtenerDatos(){
        String cad="";
        cad=cad+"Persona{nombre:"+nombre+"; ";
        cad=cad+"edad:"+edad+"; ";
        cad=cad+"estatura:"+estatura+"; ";
        cad=cad+"peso:"+peso+"; ";
        cad=cad+"genero:"+genero+"}";
        return cad;
    }
}
