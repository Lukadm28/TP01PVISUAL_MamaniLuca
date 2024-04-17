package ar.edu.unju.fi.ejercicio12.model;
import java.util.Calendar;





public class Persona {
    private String nombre;
    private Calendar fechaNacimiento;

    public Persona(String nombre, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        Calendar now = Calendar.getInstance();
        int years = now.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (fechaNacimiento.get(Calendar.MONTH) > now.get(Calendar.MONTH)
                || (fechaNacimiento.get(Calendar.MONTH) == now.get(Calendar.MONTH)
                && fechaNacimiento.get(Calendar.DAY_OF_MONTH) > now.get(Calendar.DAY_OF_MONTH))) {
            years--;
        }
        return years;
    }

    public String obtenerSignoZodiaco() {
        int month = fechaNacimiento.get(Calendar.MONTH) + 1; // Sumamos 1 porque Enero es 0
        int day = fechaNacimiento.get(Calendar.DAY_OF_MONTH);

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Tauro";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Géminis";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cáncer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Escorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagitario";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Capricornio";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Acuario";
        } else {
            return "Piscis";
        }
    }


    public String obtenerEstacion() {
        int month = fechaNacimiento.get(Calendar.MONTH) + 1; 
        int day = fechaNacimiento.get(Calendar.DAY_OF_MONTH);

        if ((month == 12 && day >= 21) || (month <= 3 && day <= 20)) {
            return "Verano";
        } else if ((month >= 3 && day >= 21) || (month <= 6 && day <= 20)) {
            return "Otoño";
        } else if ((month >= 6 && day >= 21) || (month <= 9 && day <= 22)) {
            return "Invierno";
        } else {
            return "Primavera";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }
}
