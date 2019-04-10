package br.com.digitalhouse.Exercicio02;

import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Ingresso ingresso;

        Normal ingressoNormal = new Normal(30.00f);

        CamaroteSuperior ingressoVipCamaroteSuperior = new CamaroteSuperior(
                30.00f,
                100.00f);

        CamaroteInferior ingressoVipCamaroteInferior = new CamaroteInferior(
                40.00f,
                10.00f,
                "Arquibancada 8");

        Integer numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digitar 1 para normal ou 2 para VIP: ");
        numero = scanner.nextInt();

        if ( numero == 1){//Normal
            //Imprimir valor do ingresso
            ingressoNormal.imprimirIngressoNormal();
            ingressoNormal.imprimeValor();

        } else if (numero == 2){ //VIP
            System.out.println("Ingresso VIP");

            //Camarote Superior ou Inferior
            Integer numeroCamarote;

            Scanner scannerCamarote = new Scanner(System.in);

            System.out.println("Digitar 1 para camarote superior ou 2 para camarote inferior: ");
            numeroCamarote = scanner.nextInt();

            if (numeroCamarote == 1) { //Camarote Superior
                System.out.println("Camarote superior");

                //Imprimir o valor do ingresso
                ingressoVipCamaroteSuperior.imprimeValor();

            } else if (numeroCamarote == 2){ //Camarote Inferior
                System.out.println("Camarote inferior");

                //Imprimir o valor do ingresso
                ingressoVipCamaroteInferior.imprimeValor();

            } else { //Camarote inválido
                System.out.println("Camarote inválido");
            }


        } else { //Valor inválido
            System.out.println("Valor inválido!");
        }

    }

}
