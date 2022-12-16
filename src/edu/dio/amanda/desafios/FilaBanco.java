package edu.dio.amanda.desafios;

import java.util.Scanner;

public class FilaBanco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];

        //Entrada
        for(int i = 0; i < 3; i++){
            System.out.print("Digite o nome do cliente: ");
            names[i] = scanner.next();
        }

        //Saida
        for(int i = 0; i < 3; i++){
            System.out.println(names[i] + " - esta na posicao: " + (i + 1));

        }
    }
}
