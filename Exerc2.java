/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc2;


import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class Exerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a,b,cont1,cont2;
        int x=0;

        System.out.print("Digite o valor inicial: ");
        a = ler.nextInt();

        System.out.print("Digite o valor final: ");
        b = ler.nextInt();

        //o valor inicial precisa ser menor que o final
        if (a > 0 && a < b) {
            System.out.print("\nNumeros primos entre o intervalo de "+a+" e "+b+" vale: ");
            for (cont1 = a; cont1 <= b; cont1++) {

                for (cont2 = 1; cont2 <= cont1; cont2++) {
                    if (cont1 % cont2 == 0) {
                        x += 1;
                    }
                }
                /*a variável x é usada para validar se o numero é primo
                se x=2, então o número é primo(somente divisível por 1 e por ele mesmo)
                */
                if (x == 2) {
                    System.out.print(cont1 + " ");
                }
                // Abaixo x zera para ser contabilizada e validada novamente                 
                x = 0;
            }
            System.out.println("");
        }
        // caso o numero inicial seja maior que o final, a aplicação mostra mensagem de erro
        else
        {
            System.out.println("Desculpe, os valores são inválidos");
        }
        
               
        
    }
}
