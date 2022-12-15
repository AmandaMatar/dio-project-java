package edu.dio.amanda.desafios;

import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();
        double media = (idade1 + idade2 + idade3) / 3;
        System.out.println("A média da idade é: " + media);

        if (media > 0 && media <= 25) {

            System.out.print("Turma Jovem");
        } else if (media > 25 && media <= 60) {

            System.out.print("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }
    }
}
