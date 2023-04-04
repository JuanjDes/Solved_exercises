
                /*   CALCULAR ÁREA DE UN CUADRADO, CÍRCULO O TRIÁNGULO CON LOS DATOS INTRODUCIDOS

                     Aplicación que calcula el área de un círculo, cuadrado o triángulo.
                     Pediremos de qué figura queremos calcular su área y según lo introducido
                     pedirá los valores necesarios para calcular el área.
                     Se crea un método por cada figura para calcular cada área, este devolverá un número real.
                     Muestra el resultado por pantalla.

                     Cálculo de áreas: Circulo: (radio^2)*PI
                                       Cuadrado: lado * lado
                                       Triangulo: (base * altura) / 2

                */


package com.juanjdes;

import java.util.Scanner;

public class CalculoAreas {

    public static void main(String[] args) {

        String polygonType;
        double radio, base, height, side1, side2;

        Scanner scanner = new Scanner(System.in); // Creo objeto scanner para solicitar entradas por teclado

        System.out.println("---------- CALCULAMOS AREA DE CIRCULO, CUADRADO O TRIANGULO --------");
        System.out.println("");
        System.out.print("Introduce tipo de polígono (circulo, cuadrado o triangulo) : ");
        polygonType = scanner.next(); // Solicito por teclado dato tipo String, almacenado en polygonType

        switch (polygonType) {
            case "circulo" -> {
                System.out.print("Introduce el radio del circulo: ");
                radio = scanner.nextDouble();  // Solicito por teclado dato tipo double, almacenado en radio
                System.out.println("el área del círculo es: " + AreaCirculo(radio));
            }
            case "cuadrado" -> {
                System.out.print("Introduce lado 1 del cuadrado: ");
                side1 = scanner.nextDouble();
                System.out.print("Introduce lado 2 del cuadrado: ");
                side2 = scanner.nextDouble();
                System.out.println("La base del cuadrado es: " + AreaCuadrado(side1, side2));
            }
            case "triangulo" -> {
                System.out.print("Introduce base del triangulo: ");
                base = scanner.nextDouble();
                System.out.print("Introduce altura del triangulo: ");
                height = scanner.nextDouble();
                System.out.println("La base del triangulo es: " + AreaTriangulo(base, height));
            }
            default -> System.out.println("El tipo es erróneo");
        }

        System.out.println("");
        System.out.println("---------- Fin de programa ----------");
    }


    // -------------------------------- FUNCIONES PARA CALCULAR AREAS --------------------------------

    public static double AreaCirculo(double radio) {
        return ((radio * radio) * Math.PI); //Math.PI nos da el valor de PI (3.14) exacto
    }

    public static double AreaTriangulo(double base, double height) {
        return ((base * height) / 2);
    }

    public static double AreaCuadrado(double side1, double side2) {
        return (side1 * side2);
    }
}
