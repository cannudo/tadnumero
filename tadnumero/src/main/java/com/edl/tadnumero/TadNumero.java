package com.edl.tadnumero;

import java.util.Scanner;

public class TadNumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Numero numero = new Numero();
        float valor;
        int opcao = 0;
        
        while(true) {
            System.out.println("========================================");
            System.out.println("          ESTUDO DO TAD NÚMERO          ");
            System.out.println("========================================");
            System.out.println("|    0 — Exibir valor                  |");
            System.out.println("|    1 — Modificar valor               |");
            System.out.println("|    99 — Sair                         |");
            System.out.println("========================================");
            System.out.print("Digite a opção desejada --> ");
            opcao = leitor.nextInt();
            if(opcao == 0) {
                System.out.println("Valor atual: " + numero.getValor());
            } else if(opcao == 1) {
                System.out.print("Digite o novo valor: ");
                valor = leitor.nextFloat();
                numero.setValor(valor);
            } else if(opcao == 99) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}