package com.tallerjava1;

import java.util.Scanner;

public class d_condiciones_if_else {
 public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Ingrese numero");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }
    }
 }
}
