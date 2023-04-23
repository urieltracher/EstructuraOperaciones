/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estructuraoperaciones;

/**
 *
 * @author rider
 */
import java.util.Scanner;

public class EstructuraOperaciones {
    
    public static void main(String[] args) {
        OperacionesBasicas op = new OperacionesBasicas();
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int opcion;
        do {
            System.out.println("Menu:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextDouble();
                    op.Suma(num1, num2);
                    break;
                case 2:
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextDouble();
                    op.Resta(num1, num2);
                    break;
                case 3:
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextDouble();
                    op.Multiplicacion(num1, num2);
                    break;
                case 4:
                    System.out.print("Introduce el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    num2 = scanner.nextDouble();
                    op.Division(num1, num2);
                    break;
                case 5:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 5);
        scanner.close();
    }
    
}

class OperacionesBasicas {
    
    public void Suma(double num1, double num2) {
        System.out.println("Suma: " + String.format("%5.5f", num1 + num2));
    }
    
    public void Resta(double num1, double num2) {
        System.out.println("Resta: " + String.format("%5.5f", num1 - num2));
    }
    
    public void Multiplicacion(double num1, double num2) {
        System.out.println("Multiplicación: " + String.format("%5.5f", num1 * num2));
    }
    
    public void Division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            System.out.println("División: " + String.format("%5.5f", num1 / num2));
        }
    }
    
    public void Resultado(double num1, double num2) {
        Suma(num1, num2);
        Resta(num1, num2);
        Multiplicacion(num1, num2);
        Division(num1, num2);
    }
    
}

