package br.com.digitalhouse.Exercicio02;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Ingresso ingresso;

        Integer numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digitar 1 para normal ou 2 para VIP: ");
        numero = scanner.nextInt();

        if ( numero == 1){//Normal
            System.out.println("Ingresso normal");

        } else if (numero == 2){ //VIP
            System.out.println("Ingresso VIP");

            //Camarote Superior ou Inferior
            Integer numeroCamarote;

            Scanner scannerCamarote = new Scanner(System.in);

            System.out.println("Digitar 1 para camarote superior ou 2 para camarote inferior: ");
            numeroCamarote = scanner.nextInt();

            if (numeroCamarote == 1) { //Camarote Superior
                System.out.println("Camarote superior");

                CamaroteSuperior camaroteSuperior = new CamaroteSuperior();

                //Imprimir o valor do ingresso
                System.out.println("Valor do Ingresso:" + camaroteSuperior.consultarValorIngresso());

            } else if (numeroCamarote == 2){ //Camarote Inferior
                System.out.println("Camarote inferior");

                CamaroteInferior camaroteInferior = new CamaroteInferior();

                //Imprimir o valor do ingresso
                System.out.println("Valor do Ingresso:" + camaroteInferior.consultarValorIngressoVip());

            } else { //Camarote inválido
                System.out.println("Camarote inválido");
            }


        } else { //Valor inválido
            System.out.println("Valor inválido!");
        }

    }

}
