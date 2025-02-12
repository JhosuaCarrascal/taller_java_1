package com.tallerjava1;

import java.util.Scanner;

public class ejercicio_sub_cadena {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.err.print("ingrese una cadena");
            String s = scanner.nextLine();
    
            System.err.print("ingrese el inicio de cadena");
            int start = scanner.nextInt();
              
            System.err.print("ingrese el final de cadena");
            int end = scanner.nextInt();
    
            System.out.println(s.substring(start, end));
    
            scanner.close();
        }
    }
