package edu.dio.amanda.desafios;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FlechaEscudoEspada {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int jogadaJogador = leitor.nextInt();
        int jogadaInimigo = leitor.nextInt();


        if(jogadaJogador == 1) {

            if(jogadaInimigo == 1)
                System.out.println("Empatou");

            if(jogadaInimigo == 2)
                System.out.println("Perdeu");

            if(jogadaInimigo == 3)
                System.out.println("Ganhou");

        }

        if(jogadaJogador == 2) {

            if(jogadaInimigo == 1)
                System.out.println("Ganhou");

            if(jogadaInimigo == 2)
                System.out.println("Empatou");

            if(jogadaInimigo == 3)
                System.out.println("Perdeu");

        }

        if(jogadaJogador == 3) {

            if(jogadaInimigo == 1)
                System.out.println("Perdeu");

            if(jogadaInimigo == 2)
                System.out.println("Ganhou");

            if(jogadaInimigo == 3)
                System.out.println("Empatou");

        }

    }

}
