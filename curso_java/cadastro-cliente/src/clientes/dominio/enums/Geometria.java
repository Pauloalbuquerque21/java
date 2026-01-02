package clientes.dominio.enums;
import clientes.dominio.Cliente;

public class Geometria {
    public static void main(String[] args){
        FormaGeometrica formaGeometrica = FormaGeometrica.RETANGULO;

        System.out.println("Os lados da forma: " + formaGeometrica.getLados());
        System.out.println("O nome da forma: " + formaGeometrica.getDescricao());
        System.out.println(formaGeometrica);

        /*
        Cliente cliente = new Cliente();
        Class<? extends Cliente> aClass = cliente.getClass();
        System.out.println(aClass.getName());
        System.out.println(cliente.hashCode());
         */

    }

}
