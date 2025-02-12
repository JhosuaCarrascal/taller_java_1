package com.tallerjava1;

public class tablas_de_multiplicar {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
    
            int i = 1;
            while (i <= 10) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
                i++;
            }
            scanner.close();
        }
    }
    
}