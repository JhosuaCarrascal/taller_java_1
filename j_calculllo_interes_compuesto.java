package com.tallerjava1;

import java.util.Scanner;

public class j_calculllo_interes_compuesto {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Ingrese el monto inicial de la inversión: ");
                double capitalInicial = scanner.nextDouble();
   
                System.out.print("Ingrese la tasa de interés anual (%): ");
                double tasaAnual = scanner.nextDouble();
   
                System.out.print("Ingrese el número de años de inversión: ");
                int años = scanner.nextInt();
   
                System.out.println("Seleccione la frecuencia de capitalización:");
                System.out.println("1. Mensual");
                System.out.println("2. Trimestral");
                System.out.println("3. Semestral");
                System.out.println("4. Anual");
                int opcion = scanner.nextInt();
   
                int frecuencia = 0;
                switch (opcion) {
                    case 1:
                        frecuencia = 12;
                        break;
                    case 2:
                        frecuencia = 4;
                        break;
                    case 3:
                        frecuencia = 2;
                        break;
                    case 4:
                        frecuencia = 1;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        return;
                }
   
                double tasaDecimal = tasaAnual / 100;
                double montoFinal = capitalInicial * Math.pow(1 + (tasaDecimal / frecuencia), frecuencia * años);
   
                System.out.printf("El monto final después de %d años es: %.2f%n", años, montoFinal);
            }
        }
    }


