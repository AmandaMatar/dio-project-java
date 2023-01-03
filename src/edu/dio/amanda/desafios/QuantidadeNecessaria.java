package edu.dio.amanda.desafios;

import java.util.Scanner;

public class QuantidadeNecessaria {
    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        int amigos = 0;

        int fatias = 0;

        float resultSlices = 0.0f;



        for(int x=0; x<T; x++) {

            amigos = scanner.nextInt();

            fatias = scanner.nextInt();

            float totalSlice = amigos * fatias;

            resultSlices = totalSlice / SLICE;

            int pizzas = (int)(resultSlices + 0.9);

            System.out.println(pizzas);

        }

    }

}


