/**     SIMULACIÓN PARA DAR DE ALTA EMPLEADOS APLICÁNDOLES UNA SUBIDA SALARIAL DEL PORCENTAJE QUE ELIJAMOS

        1ª Forma de dar de alta empleados: Instanciamos la Clase Empleado añadiendo datos al constructor
**/

package clases.objetos;

import javax.swing.JOptionPane;

public class Main1 {

    public static void main(String[] args) {

        // Intaciamos Empleado
        Empleado empleado = new Empleado("Juan José", 1500, 2020, 01, 01);

        System.out.println("Nombre: " + empleado.dameNombre());
        System.out.println("Sueldo: " + empleado.dameSueldo());
        System.out.println("Fecha de incorporación: " + empleado.dameAltaContrato());

        // Solicita por pantalla la subida de sueldo
        double porcentaje = Integer.parseInt(JOptionPane.showInputDialog("% de subida de sueldo: "));

        // Le pasa la variable porcentaje a la función subeSueldo() de la Clase Empleado e imprime el sueldo
        empleado.subeSueldo(porcentaje);
        System.out.print("Sueldo con la subida: " + empleado.dameSueldo());
    }
}
