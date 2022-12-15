package edu.dio.amanda.treinamento;
import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        while (true) {
            System.out.println("Nome: " );
            nome = scanner.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scanner.nextInt();
        }

    }


}
