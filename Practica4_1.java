
import java.time.LocalDateTime;

public class Practica4_1 {
    public static void main(String[] args) {
        System.out.println("\nHola Mundo!\n");
        
        LocalDateTime ahora= LocalDateTime.now();
        int año = ahora.getYear();
        int mes = ahora.getMonthValue();
        int dia = ahora.getDayOfMonth();
        int hora = ahora.getHour();
        int minutos = ahora.getMinute();
        int segundos = ahora.getSecond();
        System.out.println("Fecha actual: " + dia  + "/"+ mes +"/"+año +"\nHora actual: "+ hora  + ":"+ minutos +":"+segundos+"\n"); 

        
    }
}
