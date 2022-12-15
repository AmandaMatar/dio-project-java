package edu.dio.amanda.treinamento;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatorial = scanner.nextInt();
        System.out.println("Fatorial: ");

        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");
        for(int i = fatorial; i >= 1; i--){
            multiplicacao = multiplicacao * i;

            System.out.println(multiplicacao);

        }
    }
}
