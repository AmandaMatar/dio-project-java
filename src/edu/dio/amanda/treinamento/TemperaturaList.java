/* Faça um programa que receba a temperatura média
dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isso, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em
que mês elas ocorreram (mostrar o mes por extenso).
 */
package edu.dio.amanda.treinamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemperaturaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();
        int count = 0;
        while (true) {
            if (count == 6) break;

            System.out.println("Digite a temperatura: ");
            double temp = scanner.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        System.out.println("------");
    }
}

