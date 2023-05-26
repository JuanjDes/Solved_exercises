package com.company;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inicio;
        int suma = 1;

        System.out.print("Número para calcular factorial: ");
        inicio = scanner.nextInt();
        System.out.println("");

        for (int i = 1; i < inicio+1; i++) {
            System.out.print(suma + "*" + i + "=");
            suma = suma * i;
            System.out.print(suma + "  ");
        }
    }
}