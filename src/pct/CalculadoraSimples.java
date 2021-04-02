/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author johnleles
 */
public class CalculadoraSimples {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        //Declaracao de variaveis
        int n1, n2, adicao, subtracao, multiplicacao, opcao, escolha, divisao, resto;
        
        //Objeto de entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculadora");
        
        System.out.println("Digite o primeiro número da operação:");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo número da operação:");
        n2 = entrada.nextInt();
        
        
        //Apresentaçao
        System.out.println("\n\t\t\t CALCULADORA \n");
        
        //Menu
        System.out.println("Selecione o número correspondente da operação desejada ou tecle 5 para sair.");
        System.out.println ("1 - Adição");
        System.out.println ("2 - Subtração");   
        System.out.println ("3 - Multiplicação");
        System.out.println ("4 - Divisão");
        System.out.println ("5 - Resto");
        System.out.println ("6 - Sair");
        //opcao = entrada.nextInt();
        
        
        //Opção do usuário
        escolha = entrada.nextInt();       
        switch(escolha) {
            
            case 1: 
                adicao = n1+n2;
                System.out.println("O resoltado da soma é:"+ adicao);
                break;
            case 2: 
                subtracao = n1-n2;
                System.out.println("O resoltado da subtração é:"+ subtracao);
                break;
            case 3: 
                multiplicacao = n1*n2;
                System.out.println("O resoltado da multiplicação é:"+ multiplicacao);
                break;
            case 4: 
                divisao = n1/n2;
                System.out.println("O resoltado da divisão é:"+ divisao);
                break;
            case 5: 
                resto = n1%n2;
                System.out.println("O resoltado do resto é:"+ resto);
                break; 
            default:
                System.out.println("Adeus!");       
            }            
    }
               
          

        
    }
