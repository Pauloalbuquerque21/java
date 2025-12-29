package clientes.dominio.enums;

public class Geometria {
    public static void main(String[] args){
        FormaGeometrica formaGeometrica = FormaGeometrica.RETANGULO;

        System.out.println("Os lados da forma: " + formaGeometrica.getLados());
        System.out.println("O nome da forma: " + formaGeometrica.getDescricao());
        System.out.println(formaGeometrica);

    }

}
