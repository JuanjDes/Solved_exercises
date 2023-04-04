/*
                        GENERA NÚMEROS ALEATORIOS DENTRO DE UN RANGO

                        1. Nos pide cuantos números aleatorios queremos generar
                        2. Nos pide que rango queremos (inicio y fin) para generar esos números aleatorios
 */


package com.juanjdes;

import java.util.Scanner;
import java.util.Random;  // La clase Random se utiliza para generar números aleatorios

public class NumerosAleatorios {

    public static void main(String[] args) {

        int numberToGenerate;
        int StartingRange;
        int EndRange;
        int numbers;
        String continuar = "s";
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (continuar.equalsIgnoreCase("s")) {

            System.out.print("Cuantos números aleatorios quieres generar ? : ");
            numberToGenerate = scanner.nextInt();

            System.out.println("Entre que rango de números: ");
            System.out.print("número de inicio: ");
            StartingRange = scanner.nextInt();
            System.out.print("número de fin: ");
            EndRange = scanner.nextInt();

            System.out.println("Los números generados son: ");
            for (int i = 0; i < numberToGenerate; i++) {
                numbers = random.nextInt(StartingRange, EndRange);
                System.out.print(numbers + " " + " ");
            }

            System.out.println("");
            System.out.print("Quieres generar más números (s/n) ? : ");
            continuar = scanner.next();
        }

        System.out.println("Fin de programa");

    }
}
