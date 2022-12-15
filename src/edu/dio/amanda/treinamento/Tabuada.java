package edu.dio.amanda.treinamento;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabuada = scanner.nextInt();
        System.out.println("Tabuada: ");

        System.out.println("Tabuada de: " + tabuada);

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada + " X" + i + " = " + (tabuada*i));
        }
    }
}
