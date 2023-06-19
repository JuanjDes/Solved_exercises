package clases.objetos;

import java.util.Date;
import java.util.GregorianCalendar;

class Empleado {

        // Estas son las propiedades de la Clase
    private String nombre;
    private double sueldo;
    private Date altaContrato;

        // Este es el Constructor de la Clase
    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
        nombre = nom;
        sueldo = sue;
    }

        // Estos son los métodos de la Clase
    public String dameNombre(){  // GETTER
        return nombre;
    }
    public double dameSueldo() {  // GETTER
        return sueldo;
    }
    public Date dameAltaContrato() { // GETTER
        return altaContrato;
    }
    public void subeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

}