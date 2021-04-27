package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        int faltas;

        double LimiteFaltas = 68 * 0.25;

        System.out.println("Entre com a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.println("Entre com a segunda nota: ");
        nota2 = input.nextDouble();

        System.out.println("Entre com a terceira nota: ");
        nota3 = input.nextDouble();

        System.out.println("Insira a quantidade de faltas: ");
        faltas = input.nextInt();

        double media = (nota1 + nota2 +nota3)/3;

        if(media >=7 && faltas<=LimiteFaltas){
            System.out.print("Aprovado " + media);
        }else if(media <7 && faltas<=LimiteFaltas){
            System.out.println("Reprovado por média " + media);
        }else{
            System.out.println("Reprovado por falta");
        }



    }
}
