package clases.objetos;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Coche Renault = new Coche();

        String color = JOptionPane.showInputDialog("Elige un color del coche: ");

        // EL OBJETO showConfirmationDialog de JOptionPane DEVUELVE 0 ó 1 EN FUNCIÓN DE SI HACEMOS CLICK EN SI O NO
        int asientos_cuero = JOptionPane.showConfirmDialog(null,"Asientos de cuero ? ");
        int climatizador = JOptionPane.showConfirmDialog(null,"Quieres Climatizador ? ");

        // En estas 3 líneas se pasan parámetros (color, asientos_cuero y climatizador) a las funciones de la clase Coche
        Renault.establece_color(color);
        Renault.config_asientos(asientos_cuero);
        Renault.config_clima(climatizador);

        // A partir de aquí se hacen llamadas (recoger datos) a las funciones de la clase Coche que devuelven datos
        System.out.println(Renault.dime_datos());
        System.out.println();
        System.out.println("EXTRAS: ");
        System.out.println("---------");
        System.out.println(Renault.dime_color());
        System.out.println(Renault.dime_asientos());
        System.out.println(Renault.tiene_clima());
        System.out.println();
        System.out.println("El precio del vehículo son: " + Renault.precio_coche() + " €");
    }
}
