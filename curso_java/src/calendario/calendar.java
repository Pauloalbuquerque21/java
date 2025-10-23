package calendario;

import java.util.Calendar;

public class calendar {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();


        calendar.set(2023, Calendar.MARCH, 14); //Definindo 14 de março de 2023

        System.out.println("Data definida: "+calendar.getTime());
    }
}
