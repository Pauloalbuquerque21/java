package calendario;
import java.util.Calendar;

public class calendar2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int ano = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH) + 1;  // Lembre-se: janeiro é 0, fevereiro é 1, etc.
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Ano: " + ano);
        System.out.println("Mês: " + mes);
        System.out.println("Dia: " + dia);
    }

}
