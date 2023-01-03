package edu.dio.amanda.desafios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumeroFeliz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        boolean isHappy = false;

        Set<Integer> result = new HashSet<>();

        result.add(n);



        while (n != 1) {

            n = sumDigitSquare(n);

            if (result.contains(n)) {

                n = 0;

                break;

            }

            result.add(n);

        }



        if(n == 1) {

            isHappy = true;

        }



        if (n == 0) {

            isHappy = false;

        }

        System.out.println(isHappy);

    }



    private static int sumDigitSquare(int n) {

        int sq = 0;

        String num = Integer.toString(n);

        char[] dig = num.toCharArray();

        for (int x=0; x<dig.length; x++) {

            int digit = n % 10;

            sq += digit * digit;

            n = n / 10;

        }
        return sq;
    }
}

