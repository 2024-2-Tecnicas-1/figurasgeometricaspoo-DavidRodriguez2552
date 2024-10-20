package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura:");
        String nombre = scan.nextLine();

        System.out.println("Ingrese el color de la figura:");
        String color = scan.nextLine();

        System.out.println("Ingrese el tipo de figura(1: Círculo, 2: Rectángulo, 3: Triángulo): ");
        int tipofigura = scan.nextInt();

        FiguraGeometrica figura = null;

        switch (tipofigura) {
            case 1:
                System.out.println("Ingrese el radio del círculo:");
                double radio = scan.nextDouble();
                figura = new Circulo(nombre, color, radio);
                break;
            case 2:
                System.out.println("Ingrese el valor del lado 1 del rectángulo:");
                double lado1 = scan.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo:");
                double lado2 = scan.nextDouble();
                figura = new Rectangulo(nombre, color, lado1, lado2);
                break;
            case 3:
                System.out.println("Ingrese el valor de la base del triángulo:");
                double base = scan.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo:");
                double altura = scan.nextDouble();
                figura = new Triangulo(nombre, color, base, altura);
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }
        if (figura != null) {
            System.out.println("El área de la figura es: " + figura.obtenerArea());
            System.out.println("El perímetro de la figura es: " + figura.obtenerPerimetro());
        } else {
            System.out.println("No se pudo crear la figura.");
        }
        scan.close();
    }
}
