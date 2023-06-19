/**     SIMULACIÓN PARA DAR DE ALTA EMPLEADOS APLICÁNDOLES UNA SUBIDA SALARIAL DEL PORCENTAJE QUE ELIJAMOS

        3ª Forma de dar de alta empleados: creamos un Array y vamos solicitando datos por pantalla para ir
           añadiéndolos al Array
**/

package clases.objetos;

import javax.swing.JOptionPane;

public class Main3 {

    public static void main(String[] args) {

        // longitudArray va a determinar el tamaño del array
        int longitudArray = Integer.parseInt(JOptionPane.showInputDialog("Cuantos empleados quieres dar de alta ?"));
        Empleado[] arrayEmpleado = new Empleado[longitudArray];

        // Empieza a recorrer el Array para ir rellenándolo
        for (int i = 0; i < arrayEmpleado.length; i++) {
            // pide datos por pantalla y va almacenándolos en variables
            String nombre = JOptionPane.showInputDialog("Nombre");
            double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Sueldo"));
            int agno = Integer.parseInt(JOptionPane.showInputDialog("Año de alta"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes de alta"));
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia de alta"));

            // En la posición que está del Array, rellena la fila de golpe con las variables de antes
            arrayEmpleado[i] = new Empleado(nombre, sueldo, agno, mes, dia);
        }
        
        double porcentaje = Integer.parseInt(JOptionPane.showInputDialog("% de subida de sueldo: "));

        // Empieza a recorrer el Array otra vez para ir modificando el sueldo de cada empleado
        for (int i = 0; i < arrayEmpleado.length; i++) {
            // Por cada fila del array aplica la función para subir el sueldo
            arrayEmpleado[i].subeSueldo(porcentaje);
        }

        // Vuelve a recorrer el Array para ir mostrándolo por pantalla
        for (int i = 0; i < arrayEmpleado.length; i++) {
            System.out.print("Nombre: " + arrayEmpleado[i].dameNombre() + "\n" +   //  \n hace un salto de línea
                    "Sueldo: " + arrayEmpleado[i].dameSueldo() + "\n" +
                    "Fecha de alta: " + arrayEmpleado[i].dameAltaContrato() + "\n" +
                    "-----------------------------" + "\n");
        }
    }
}
