/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc3;

import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class Exerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        System.out.print("Digite o número de horas trabalhadas: ");
        int nh=ler.nextInt();
        System.out.print("Digite o valor do salário mínimo: ");
        double vsm=ler.nextInt();
        double sb,sr,vh;
        
        //valor de cada hora trabalhada
        vh=vsm*0.1;
        
        //salário bruto
        sb=nh*vh;
        
        /*salário a receber
        Abaixo utilizo o conceito de fator de diminuição ==> valor_final=valor_inicial * (1-taxa)
        */
        sr=sb*0.97;
        
        // Abaixo utilizo o NumberFormat para adequar o numero na forma monetária
        System.out.println("O valor do salário a receber vale: "+NumberFormat.getCurrencyInstance().format(sr));
    }
}
