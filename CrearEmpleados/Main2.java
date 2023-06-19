/**     SIMULACIÓN PARA DAR DE ALTA EMPLEADOS APLICÁNDOLES UNA SUBIDA SALARIAL DEL PORCENTAJE QUE ELIJAMOS

        2ª Forma de dar de alta empleados: Creamos un Array y lo rellenamos con los datos de los empleados.
           al crear el Array de una Clase (Empleado[]), se le pueden añadir datos de tipos diferentes.
**/

package clases.objetos;

import javax.swing.*;

public class Main2 {

    public static void main(String[] args) {

        Empleado[] arrayEmpleado = new Empleado[3]; // Creo array arrayEmpleado de la Clase Empleado con 3 filas
        arrayEmpleado[0] = new Empleado("Juan Jose", 1500, 2020, 01, 01); // Datos de fila 1
        arrayEmpleado[1] = new Empleado("Jose", 1500, 2021, 02, 01);      // Datos de fila 2
        arrayEmpleado[2] = new Empleado("Juan", 1600, 2022, 01, 01);      // Datos de fila 3

        double porcentaje = Integer.parseInt(JOptionPane.showInputDialog("% de subida de sueldo: "));

        for (int i = 0; i < arrayEmpleado.length; i++) {
            arrayEmpleado[i].subeSueldo(porcentaje); // Por cada fila del array aplica la función para subir el sueldo
        }
        for (int i = 0; i < arrayEmpleado.length; i++) {
            System.out.print("Nombre: " + arrayEmpleado[i].dameNombre() + "\n" +
                    "Sueldo: " + arrayEmpleado[i].dameSueldo() + "\n" +
                    "Fecha de alta: " + arrayEmpleado[i].dameAltaContrato() +
                    "\n" + "-------------------------------------" + "\n");
        }
    }
}
