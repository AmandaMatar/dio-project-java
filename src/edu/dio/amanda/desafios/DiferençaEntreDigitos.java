package edu.dio.amanda.desafios;

import java.util.Arrays;
import java.util.Scanner;

public class DiferençaEntreDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        int produto = 1;
        int soma = 0;

        String numeroEmString = String.valueOf(numero);
        String[] split = numeroEmString.split("");

        int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

        for(int x = 0; x < ints.length; x++){
            produto *= ints[x];
            soma += ints[x];
        }
        System.out.println(produto - soma);
    }
}
