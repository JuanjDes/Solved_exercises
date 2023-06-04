                // VALIDAR DIRECCIÓN DE EMAIL. SOLO PUEDE LLEVAR UNA @ Y DESDE LA @ POR LO MENOS UN .

package com.company;

import javax.swing.JOptionPane;

public class ValidaEmail {

    public static void main(String[] args) {

        int arroba = 0;
        int posArroba = 0;
        boolean punto = false;
        boolean repetir = true;

        while (repetir) {
            String email = JOptionPane.showInputDialog(null, "Introduce un email", "nombre@company.com");

            /* El siguiente FOR recorre el String email buscando @. La variable arroba almacena cuantas @ hay
               y posArroba almacena en que posición está */
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    arroba++;
                    posArroba = i;
                }
            }

            /* En este FOR, desde la posición donde está la @ recorre el resto del String email buscando un punto.
               Si lo encuentra pone la variable punto a true */
            for (int j = posArroba; j < email.length(); j++) {
                if (email.charAt(j) == '.') punto = true;
            }

            // Si hay solo una @ y después de ella un punto, el While ya no se repetirá
            if (arroba == 1 && punto) {
                JOptionPane.showMessageDialog(null, "Correcto");
                repetir = false;

            } else {
                JOptionPane.showMessageDialog(null, "Incorrecto");
                arroba = 0;
            }
        }
    }
}
