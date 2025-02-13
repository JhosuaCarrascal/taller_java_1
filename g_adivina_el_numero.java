package com.tallerjava1;

import java.util.Random;

import java.util.Scanner;

public class g_adivina_el_numero {
   
        public static void main(String[] args) {
            Random random = new Random();
            int numeroAleatorio = random.nextInt(50) + 1;
            try (Scanner scanner = new Scanner(System.in)) {
                int intento;
   
                do {
                    System.out.print("Adivina el número (1-50): ");
                    intento = scanner.nextInt();
   
                    if (intento < numeroAleatorio) {
                        System.out.println("Demasiado bajo.");
                    } else if (intento > numeroAleatorio) {
                        System.out.println("Demasiado alto.");
                    } else {
                        System.out.println("¡Correcto! El número era " + numeroAleatorio);
                    }
                } while (intento != numeroAleatorio);
            }
        }
    }
