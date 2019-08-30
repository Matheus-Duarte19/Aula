/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cálculo.eletrico;

import java.util.Scanner;

/**
 *
 * @author extra
 */
public class CálculoEletrico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       float quantidade, Consumo, potencia, horas, dias, taxa, preco; 
       
      
        System.out.println("Qual é a Potência do seu aparelho(em Watts)?");
        potencia = scan.nextInt();
        
        System.out.println("Quantos aparelho são (iguais)?");
        quantidade = scan.nextInt();
        
        System.out.println("Quantas horas o aparelho fica ligado por dia?");
        horas = scan.nextInt();
        
        System.out.println("Quantos dias ele fica ligado?");
        dias = scan.nextInt();
        
        System.out.println("Taxa de Luz?");
        taxa = scan.nextFloat();
        
        
        System.out.println("\n");
        
        System.out.println("Quatindade: " + quantidade);
        System.out.println("Pontência: " + potencia+"W");
        System.out.println("Horas: " + horas);
        System.out.println("Dias: " + dias);
        System.out.println("Taxa: " + taxa);
        
        Consumo = quantidade*potencia*horas*dias/1000;
        
        preco = Consumo*taxa;
        
        
        System.out.println("\n");
        System.out.println("Consumo: " + Consumo + "kWh/mês");
        System.out.println("Preço por Consumo: R$" + preco );
        
    }
    
}
