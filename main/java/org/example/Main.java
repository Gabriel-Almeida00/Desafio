package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de maçãs compradas: ");
        int numeroMacas = scanner.nextInt();

        double custoTotal = 0;

        if (numeroMacas < 12) {
            custoTotal = numeroMacas * 1.30;
        } else {
            custoTotal = numeroMacas * 1.00;
        }

        System.out.println("Custo total da compra: R$ " + custoTotal);

        scanner.close();
    }
}