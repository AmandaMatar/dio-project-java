package edu.dio.amanda.desafios;

import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();
        int media = (idade1 + idade2 + idade3) / 3;
        System.out.println("A média da idade é: " + media);

        if (media >= 62 && media <= 70) {

            System.out.print("Idosa");
        } else if (media >= 7 && media >= 22) {

            System.out.print("Jovem");

        }
    }
}
