/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc4;

import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class Exerc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tam,nLata,qtdLata,preco,CapLata;
        
        
        
        do{
        Scanner ler=new Scanner(System.in);
        System.out.println("Digite o tamanho(em metros) da área a ser pintada: ");
        tam=ler.nextInt();
        }while(tam==0);
        
        CapLata=18*3;
        nLata=Math.ceil(tam/CapLata);
        
        if(nLata<=1){
            qtdLata=1;
        }else{
            qtdLata=nLata;
        }
        preco=nLata*80;
        
        System.out.println("A quantidade de latas de tinta a serem compradas: "+qtdLata);
        System.out.println("O preco total vale: R$"+preco);
  
}
}
